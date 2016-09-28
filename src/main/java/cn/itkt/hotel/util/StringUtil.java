package cn.itkt.hotel.util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.metamodel.domain.JavaType;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
public class StringUtil {

	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}

	public static boolean isEmpty(Object obj) {
		return obj == null || obj.toString().length() == 0;
	}

	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	public static boolean isBlank(String str) {
		return str == null || str.trim().length() == 0;
	}

	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}

	public static Map<String, String> jsonToMap(String jsonString)
			throws Exception {
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		Map<String, String> map = new HashMap<String, String>();
		for (Iterator<?> iter = jsonObject.keys(); iter.hasNext();) {
			String key = (String) iter.next();
			String value = jsonObject.get(key).toString();
			map.put(key, value);
		}
		return map;
	}

	public static List<Map<String, String>> jsonToList(String jsonString)
			throws Exception {
		JSONArray arry = JSONArray.fromObject(jsonString);
		List<Map<String, String>> rsList = new ArrayList<Map<String, String>>();
		for (int i = 0; i < arry.size(); i++) {
			JSONObject jsonObject = arry.getJSONObject(i);
			Map<String, String> map = new HashMap<String, String>();
			for (Iterator<?> iter = jsonObject.keys(); iter.hasNext();) {
				String key = (String) iter.next();
				String value = jsonObject.get(key).toString();
				map.put(key, value);
			}
			rsList.add(map);
		}
		return rsList;
	}


	public <T> List<T> toJavaList(T clazz, String jsonString) {
		List<T> objs = null;
		JSONArray jsonArray = (JSONArray) JSONSerializer.toJSON(jsonString);
		if (jsonArray != null) {
			objs = new ArrayList<T>();
			List list = (List) JSONSerializer.toJava(jsonArray);
			for (Object o : list) {
				JSONObject jsonObject = JSONObject.fromObject(o);
				T obj = (T) JSONObject.toBean(jsonObject, clazz.getClass());
				objs.add(obj);
			}
		}
		return objs;
	}

	public static Object mapToBean(Class<?> clazz, Map<String, String> map) {
		Object obj = null;
		try {
			JSONObject jsonObject = JSONObject.fromObject(JSONObject.fromObject(map).toString());
			obj = JSONObject.toBean(jsonObject, clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	public static Object jsonToBean(Class<?> clazz, String jsonString) {
		Object obj = null;
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		obj = JSONObject.toBean(jsonObject, clazz);
		return obj;
	}
	
	public static JSONObject mapToJson(Map<String,String> map) {
		JSONObject jsonObj = JSONObject.fromObject(map);
		return jsonObj;
	}
	/**
	 * json通过bean转成对象
	 * 
	 * @param jsonString
	 * @param clazz
	 * @param map
	 * @return
	 */
	public static Object getDTO(String jsonString, Class<?> clazz,
			Map<String, Object> map) {
		JSONObject jsonObject = null;
		try {
			jsonObject = JSONObject.fromObject(jsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSONObject.toBean(jsonObject, clazz, map);
		
	}

	public static JSONObject toJson(Object obj) {
		JSONObject jsonObj = JSONObject.fromObject(obj);
		return jsonObj;
	}

	public static String toJsonString(Object obj) {
		JSONObject jsonObj = JSONObject.fromObject(obj);
		return jsonObj.toString();
	}
	
	public static String fetchPaginationString(int page,int rows,String sort,boolean asc) {
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("needsPaginate", true);
		jsonobj.put("startPos",rows*(page-1));
		jsonobj.put("amount",rows);
		jsonobj.put("sortProperty",sort);
		jsonobj.put("asc",asc);
		return jsonobj.toString();
	}
	
	public static String fetchPaginationString(int page,int rows) {
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("needsPaginate", true);
		jsonobj.put("startPos",rows*(page-1));
		jsonobj.put("amount",rows);
//		jsonobj.put("sortProperty","");
//		jsonobj.put("asc","");
		return jsonobj.toString();
	}
	
	public static String fetchPaginationString(int page,int rows,boolean needsPaginate) {
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("needsPaginate", needsPaginate);
		jsonobj.put("startPos",rows*(page-1));
		jsonobj.put("amount",rows);
		return jsonobj.toString();
	}
	
	public static String getToken(){
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String dchars = "" ;
		for (int i = 0; i < 6; i++) {
			dchars+=chars.charAt((int)(Math.random() * 26)) ;
		}
		dchars = dchars + DateToTimestamp(new Date());
		return dchars ;

	}
	
	public static Integer DateToTimestamp(Date time){
        Timestamp ts = new Timestamp(time.getTime());
        return (int) ((ts.getTime())/1000);
    }
    
}
