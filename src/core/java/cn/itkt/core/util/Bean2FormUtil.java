package cn.itkt.core.util;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 将javabean转换成form表单形式常用类
 * @author jixf
 * @version 1.0 , 2013-2-19 下午01:41:06
 */
public class Bean2FormUtil {

	/**
	 * 将bean对象拼接成form表单格式，注：所有日期类型将转换成yyyy-MM-dd hh:mm:ss格式
	 * @param beansMap 需要转换的beanMap对象，key:beanName value=value
	 * @return 拼接好的form表单信息
	 * @throws
	 * @author jixf
	 */
	public static String beans2Form(Map<String, Object> beansMap) {
		if (beansMap != null && beansMap.size() > 0) {
			StringBuffer result = new StringBuffer();
			Map<String, String> resultMap = new HashMap<String, String>();
			try {
				for (String beanName : beansMap.keySet()) {
					Bean2FormUtil.reflect(resultMap, beansMap.get(beanName), beanName);
				}

			} catch (IntrospectionException e) {
				e.printStackTrace();
				throw new RuntimeException("对象拼接表单信息时出错", e);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				throw new RuntimeException("对象拼接表单信息时出错", e);
			} catch (InvocationTargetException e) {
				e.printStackTrace();
				throw new RuntimeException("对象拼接表单信息时出错", e);
			}

			for (String key : resultMap.keySet()) {
				result.append(key).append("=").append(resultMap.get(key)).append("&");
			}
			if (result.lastIndexOf("&") > -1 && result.lastIndexOf("&") == result.length() - 1) {
				result.deleteCharAt(result.length() - 1);
			}
			return result.toString();
		} else
			return "";
	}

	/**
	 * 将单个bean对象拼接成form表单格式，注：所有日期类型将转换成yyyy-MM-dd hh:mm:ss格式
	 * @param bean 需要转换的bean对象
	 * @return 拼接好的form表单信息
	 * @throws
	 * @author jixf
	 */
	public static String bean2Form(Object bean) {
		if (bean != null) {
			StringBuffer result = new StringBuffer();
			Map<String, String> resultMap = new HashMap<String, String>();
			try {
				Bean2FormUtil.reflect(resultMap, bean, null);
			} catch (IntrospectionException e) {
				e.printStackTrace();
				throw new RuntimeException("对象拼接表单信息时出错", e);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				throw new RuntimeException("对象拼接表单信息时出错", e);
			} catch (InvocationTargetException e) {
				e.printStackTrace();
				throw new RuntimeException("对象拼接表单信息时出错", e);
			}

			for (String key : resultMap.keySet()) {
				result.append(key).append("=").append(resultMap.get(key)).append("&");
			}
			if (result.lastIndexOf("&") > -1 && result.lastIndexOf("&") == result.length() - 1) {
				result.deleteCharAt(result.length() - 1);
			}
			return result.toString();
		} else
			return "";
	}

	/**
	 * 使用反射，获取bean对象信息放入map中
	 * @param map 接受form表单信息
	 * @param bean 需要进行反射的对象
	 * @param beanName 需要进行反射的对象name，注：可以null
	 * @throws IntrospectionException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws
	 * @author jixf
	 */
	public static void reflect(Map<String, String> map, Object bean, String beanName) throws IntrospectionException,
			IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		// 判断对象是否为空
		if (null != bean) {
			Class<?> clazz = bean.getClass();
			// 对象是简单类型直接调用 toString方法，日期格式问题暂时不处理
			if (SimpleTypeRegistry.isSimpleType(clazz)) {
				if (clazz == Date.class) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					map.put(beanName, sdf.format(bean));
				} else {
					map.put(beanName, bean.toString());
				}
			} else {// 对象不是简单类型，处理其字段
				// 获取所有字段集合
				Field[] FieldArray = clazz.getDeclaredFields();
				for (Field field : FieldArray) {
					if (field.getName().equals("serialVersionUID")) {
						continue;
					}
					PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
					Method getMethod = pd.getReadMethod();
					Class<?> fiedTypeClazz = field.getType();
					String fieldName = beanName == null ? field.getName() : beanName + "." + field.getName();
					String value = "";
					Object obj = getMethod.invoke(bean);
					if (SimpleTypeRegistry.isSimpleType(fiedTypeClazz) && null != obj) {//简单类型
						if (fiedTypeClazz == Date.class) {
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
							value = sdf.format(obj);
						} else {
							value = obj.toString();
						}
						map.put(fieldName, value);
					} else if (fiedTypeClazz.isArray() && null != obj) {//集合
						Object[] array = (Object[]) obj;
						for (int i = 0; i < array.length; i++) {
							Object objArr = array[i];
							Bean2FormUtil.reflect(map, objArr, fieldName + "[" + i + "]");
						}

					} else if (Collection.class.isAssignableFrom(fiedTypeClazz) && null != obj) {//collection接口子类
						Collection<?> collection = (Collection<?>) obj;
						Object[] array = collection.toArray();
						for (int i = 0; i < array.length; i++) {
							Object objArr = array[i];
							Bean2FormUtil.reflect(map, objArr, fieldName + "[" + i + "]");
						}
					} else if (obj != null) {
						Bean2FormUtil.reflect(map, obj, fieldName);
					}
				}
			}
		}
	}

	/**
	 * 简单类型注册
	 * @author jixf
	 * @version 1.0 , 2013-2-20 下午02:49:43
	 * @see
	 */
	private static class SimpleTypeRegistry {
		private static final Set<Class<?>> SIMPLE_TYPE_SET = new HashSet<Class<?>>();
		static {
			SIMPLE_TYPE_SET.add(String.class);
			SIMPLE_TYPE_SET.add(Byte.class);
			SIMPLE_TYPE_SET.add(Short.class);
			SIMPLE_TYPE_SET.add(Character.class);
			SIMPLE_TYPE_SET.add(Integer.class);
			SIMPLE_TYPE_SET.add(Long.class);
			SIMPLE_TYPE_SET.add(Float.class);
			SIMPLE_TYPE_SET.add(Double.class);
			SIMPLE_TYPE_SET.add(Boolean.class);
			SIMPLE_TYPE_SET.add(Date.class);
			SIMPLE_TYPE_SET.add(Class.class);
			SIMPLE_TYPE_SET.add(BigInteger.class);
			SIMPLE_TYPE_SET.add(BigDecimal.class);

			SIMPLE_TYPE_SET.add(boolean.class);
			SIMPLE_TYPE_SET.add(byte.class);
			SIMPLE_TYPE_SET.add(char.class);

			SIMPLE_TYPE_SET.add(short.class);
			SIMPLE_TYPE_SET.add(int.class);
			SIMPLE_TYPE_SET.add(long.class);

			SIMPLE_TYPE_SET.add(float.class);
			SIMPLE_TYPE_SET.add(double.class);

		}

		/**
		 * Tells us if the class passed in is a known common type
		 * @param clazz The class to check
		 * @return True if the class is known
		 */
		public static boolean isSimpleType(Class<?> clazz) {
			return SIMPLE_TYPE_SET.contains(clazz);
		}

	}
}
