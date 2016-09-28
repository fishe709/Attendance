package cn.itkt.core.util;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Scanner;

import com.alibaba.fastjson.JSONObject;

public class HttpClientUtil {

	/**
	 * doJsonPost
	 * @param <T>
	 * @param reqUrl 请求url
	 * @param jsonParams 只能传一个json对象的json串，多个对象不解析
	 * @param resultClass
	 * @return
	 * @author jixf
	 */
	public static <T> T doJsonPost(String reqUrl, String jsonParams, Class<T> resultClass) {
		URL url = null;
		T result = null;
		try {
			url = new URL(reqUrl);
			URLConnection conn = url.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setDefaultUseCaches(false);
			conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8"); //设定 请求格式 json，也可以设定xml格式的  

			DataOutputStream out = new DataOutputStream(conn.getOutputStream());
			out.writeBytes(jsonParams);
			out.flush();
			out.close();

			conn.connect();

			Scanner in = new Scanner(conn.getInputStream(), "utf-8");
			StringBuffer sb = new StringBuffer();
			while (in.hasNextLine()) {
				String str = in.nextLine();
				sb.append(str + "\r\n");
			}
			result = JSONObject.parseObject(sb.toString(), resultClass);
			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * post方式发送http请求，并直接解析返回json,返回对象
	 * @param <T> 方法返回值类型
	 * @param reqUrl 请求地址
	 * @param params 请求参数，格式：param1=value1 & param2=value2...
	 * @param resultClass 返回结果类型
	 * @return
	 * @throws
	 * @author jixf
	 */
	public static <T> T doFormPost(String reqUrl, String formParams, Class<T> resultClass) {
		URL url = null;
		T result = null;
		try {
			url = new URL(reqUrl);
			URLConnection conn = url.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setDefaultUseCaches(false);

			OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "utf-8");
			formParams = formParams.replaceAll("%", "%25");
			out.write(formParams); //post的关键所在！  
			// remember to clean up  
			out.flush();
			out.close();

			conn.connect();

			Scanner in = new Scanner(conn.getInputStream(), "utf-8");
			StringBuffer sb = new StringBuffer();
			while (in.hasNextLine()) {
				String str = in.nextLine();
				sb.append(str + "\r\n");
			}
			result = JSONObject.parseObject(sb.toString(), resultClass);
			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static String doFormPost(String reqUrl, String formParams) {
		URL url = null;
		String result = null;
		try {
			url = new URL(reqUrl);
			URLConnection conn = url.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setDefaultUseCaches(false);

			OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "utf-8");
			formParams = formParams.replaceAll("%", "%25");
			out.write(formParams); //post的关键所在！  
			// remember to clean up  
			out.flush();
			out.close();

			conn.connect();

			Scanner in = new Scanner(conn.getInputStream(), "utf-8");
			StringBuffer sb = new StringBuffer();
			while (in.hasNextLine()) {
				String str = in.nextLine();
				sb.append(str + "\r\n");
			}
			result = sb.toString();
			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 单个bean对象以表单格式做post请求
	 * @param <T> 返回值类型
	 * @param reqUrl 请求url
	 * @param bean 请求对象
	 * @param resultClass
	 * @return
	 * @throws
	 * @author jixf
	 */
	public static <T> T doFormPost(String reqUrl, Object bean, Class<T> resultClass) {
		String formParams = Bean2FormUtil.bean2Form(bean);
		return doFormPost(reqUrl, formParams, resultClass);
	}

	/**
	 * 多个bean对象以表单格式做post请求
	 * @param <T> 返回值类型
	 * @param reqUrl 请求url
	 * @param beansMap key: beanName value:bean
	 * @param resultClass
	 * @return
	 * @throws
	 * @author jixf
	 */
	public static <T> T doFormPost(String reqUrl, Map<String, Object> beansMap, Class<T> resultClass) {
		String formParams = Bean2FormUtil.beans2Form(beansMap);
		return doFormPost(reqUrl, formParams, resultClass);
	}

	//	@Test
	//	public void test1() {
	//		HttpClientUtil.doFormPost("http://localhost:8080/btsf/mvc/mobile/ehotel/addCheckPersonnel", "", AddVo.class);
	//	}

	//	@Test
	//	public void test4() {
	//		MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<String, String>();
	//		multiValueMap.add("terminalId", "11");
	//		multiValueMap.add("userId", "11");
	//		multiValueMap.add("name", "111");
	//		AddVo vo = HttpClientUtil.doFormPost("http://localhost:8080/btsf/mvc/mobile/ehotel/addCheckPersonnel", multiValueMap, AddVo.class);
	//		System.out.println(vo);
	//	}
}
