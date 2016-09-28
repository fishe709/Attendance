package cn.itkt.hotel.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class ActionUtil {

	/**
	 * 模拟post 请求
	 * @param URL
	 * @param param
	 * @return
	 */
	public static String sendPost(String URL, String param) {
		String result = "";
		try {
			URL requestUrl = new URL(URL);

			HttpURLConnection httpConn = (HttpURLConnection) requestUrl
					.openConnection();
			httpConn.setConnectTimeout(5000);
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			httpConn.setUseCaches(false);
			httpConn.setRequestMethod("POST");
			httpConn.setInstanceFollowRedirects(true);
			
			PrintWriter out = new PrintWriter(new OutputStreamWriter(httpConn.getOutputStream(),"UTF-8"));
			out.print(param);
			out.flush();
			out.close();

			InputStream inputStream = httpConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(
					inputStream, "utf-8");
			BufferedReader in = new BufferedReader(inputStreamReader);
			String lineStr;
			while ((lineStr = in.readLine()) != null) {
				result += lineStr;
				result += "\r\n";
			}
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		if(result!=null){
			result = result.replaceAll("data", "rows") ;
		}
		return result;
	}

		
		
	//	public static <T> T toObject(T clazz, String jsons) {
	//		T obj=null;
	//		JSONObject jsonObject = JSONObject.fromObject(jsons);
	//	}
}
