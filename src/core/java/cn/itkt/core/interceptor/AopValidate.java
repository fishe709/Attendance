package cn.itkt.core.interceptor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import javax.validation.Valid;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;

public class AopValidate {

	private Validator validator;

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	//private final static String el = "@annotation(org.springframework.web.bind.annotation.RequestMapping)";
	public Object doBasicProfiling(ProceedingJoinPoint joinPoint) throws Throwable {
		Object retVal = null;
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		//获取方法参数的注解
		Annotation[][] argAnnotations = method.getParameterAnnotations();
		//获取方法上注解
		//		    Annotation[] methodAnnotations=method.getAnnotations();
		//获取方法属性别名
		String[] argNames = methodSignature.getParameterNames();
		//获取属性参数
		Object[] args = joinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			if (hasRequestBodyAndValidAnnotations(argAnnotations[i])) {
				Object ret = validateAnnotationsArg(args[i], argNames[i], method);
				if (ret != null) {
					return ret;
				}

			}
		}
		retVal = joinPoint.proceed(args);
		return retVal;
	}

	//判断是否是需要效验数据
	private boolean hasRequestBodyAndValidAnnotations(Annotation[] annotations) {
		boolean needValidate = false;
		for (Annotation annotation : annotations) {
			if (Valid.class.isInstance(annotation))
				needValidate = true;
			if (needValidate) {
				return true;
			}
		}
		return false;
	}

	private Object validateAnnotationsArg(Object arg, String argName, Method method) {
		BindingResult result = getBindingResult(arg, argName);
		validator.validate(arg, result);
		if (result.hasErrors()) {
			StringBuffer sb = new StringBuffer();
			for (FieldError fieldError : result.getFieldErrors()) {
				sb.append(fieldError.getDefaultMessage());
				sb.append("+");
			}
			Class<?> cla = method.getReturnType();
			try {
				Object obj;
				obj = cla.newInstance();
				setter(obj, "Message", sb.toString(), String.class);
				setter(obj, "StatusCode", "-100", String.class);//所有验证异常错误码为-100
				return obj;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 设置反射属性值
	 * @param obj
	 * @param att
	 * @param value
	 * @param type
	 */
	public static void setter(Object obj, String att, Object value, Class<?> type) {
		try {
			Method method = obj.getClass().getMethod("set" + att, type);
			method.invoke(obj, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private BindingResult getBindingResult(Object target, String targetName) {
		return new BeanPropertyBindingResult(target, targetName);
	}

}
