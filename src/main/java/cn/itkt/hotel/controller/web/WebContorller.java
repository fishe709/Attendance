package cn.itkt.hotel.controller.web;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itkt.core.gson.GsonUtils;
import cn.itkt.hotel.dto.PdaRequest;
import cn.itkt.hotel.exception.InfoException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@RequestMapping("/web")
public class WebContorller {
    
    private static final Set<String> SQLINJECT_KEYWORDS = new HashSet<String>(20);

    private static final Set<String> XSS_KEYWORDS = new HashSet<String>(20);

	public Gson gson;

	public WebContorller() {
		if (gson == null) {
	           gson = GsonUtils.createCommonBuilder().create();
	       }
	}
	
	public <T> PdaRequest<T> checkPrecondition(String jsonString, PdaRequest<T> request){
		if(StringUtils.isBlank(jsonString)){
			throw new InfoException("请求参数不能为空!");
		}
		Type type = new TypeToken<PdaRequest<T>>(){}.getType();
		request = gson.fromJson(jsonString, type);
		String originApp = request.getOriginApp();
		if(StringUtils.isBlank(originApp)){
			throw new InfoException("数据来源不能为空!");
		}
		return request;
	}
	
	public String replaceBlank(String str)
	{
		Pattern p = Pattern.compile("\\s*|\t|\r|\n");
		Matcher m = p.matcher(str);
		return m.replaceAll("");
	}
	
	 /**.
     * 方法：过DTO类滤参数值（SQL注入和跨站攻击）
     * @param obj
     * @return 
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public Object filterDTOParameterValue(Object obj) throws IllegalArgumentException,
            IllegalAccessException, InvocationTargetException {
        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();
        String filedValue = "";
        String fieldName = "";
        for (Field field : fields) {
            if (String.class.equals(field.getType())) {
                fieldName = upperCaseFirstChar(field.getName());
                try {
                    Method getter = (Method) obj.getClass().getMethod("get" + fieldName);
                    filedValue = (String) getter.invoke(obj);
                    if (StringUtils.isNotEmpty(filedValue)) {
                        filedValue = this.filterParameterValue(filedValue);
                        Method setter = (Method) obj.getClass().getMethod("set" + fieldName,
                                String.class);
                        setter.invoke(obj, filedValue);
                    }
                } catch (java.lang.NoSuchMethodException e) {
                }
            }
        }
        return obj;
    }

    /**
     * 过滤参数值（SQL注入和跨站攻击）
     * @param value 参数值
     * @return 返回过滤后的参数
     */
    public String filterParameterValue(String value) {
        StringBuffer result = new StringBuffer();
        if (value != null) {
            if(StringUtils.isNotEmpty(value)) {
                result.append(value.trim().toLowerCase());
                filterSQLInject(result);
                filterXSS(result);
            } else {
                return value;
            }
        }
        if (result.toString().equals(value.trim().toLowerCase()) ) {
            return value.trim();
        }
        return result.toString();
    }

    private void filterSQLInject(StringBuffer value) {
        if (value == null || "".equals(value)) {
            return;
        }
        int startIndex;
        int endIndex;
        for (String keyword : SQLINJECT_KEYWORDS) {
            startIndex = value.indexOf(keyword);
            if (startIndex != -1) {
                endIndex = startIndex + keyword.length();
                value = value.replace(startIndex, endIndex, "");
            }
        }
    }

    private void filterXSS(StringBuffer value) {
        if (value == null || "".equals(value)) {
            return;
        }
        int startIndex;
        int endIndex;
        for (String keyword : XSS_KEYWORDS) {
            startIndex = value.indexOf(keyword);
            if (startIndex != -1) {
                endIndex = startIndex + keyword.length();
                value = value.replace(startIndex, endIndex, "");
            }
        }
    }
    
    /**
     * . 方法：将字符串的首字母大写后返回
     * 
     * @param str
     * @return
     */
    private String upperCaseFirstChar(String str) {
        byte[] items = str.getBytes();
        // 小写字母ASCII码范围
        if (items[0] >= 97 && items[0] <= 122) {
            items[0] = (byte) ((char) items[0] - 'a' + 'A');
            return new String(items);
        }
        return str;
    }
    /**
     * 初始化字典
     */
    static {
        SQLINJECT_KEYWORDS.add("select");
        SQLINJECT_KEYWORDS.add("from");
        SQLINJECT_KEYWORDS.add("update");
        SQLINJECT_KEYWORDS.add("insert");
        SQLINJECT_KEYWORDS.add("update");
        SQLINJECT_KEYWORDS.add("and");
        SQLINJECT_KEYWORDS.add("delete");
        SQLINJECT_KEYWORDS.add("truncat");
        
        XSS_KEYWORDS.add("script");
        XSS_KEYWORDS.add("iframe");
        XSS_KEYWORDS.add("frameset");
        XSS_KEYWORDS.add("alert");
        XSS_KEYWORDS.add("window.open");
        XSS_KEYWORDS.add("cookie");
        XSS_KEYWORDS.add("<");
        XSS_KEYWORDS.add(">");
    }
	
}
