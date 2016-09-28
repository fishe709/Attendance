package cn.itkt.core.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;

public final class HttpUtil {

	public static String doGet(String url) {
		return doGet(url, Encoding.UTF_8);
	}

	public static String doGet(String url, String encoding) {
		StringBuffer result = new StringBuffer();
		BufferedReader in = null;
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立实际的连接
			connection.connect();
			// 定义 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));
			String line;
			while ((line = in.readLine()) != null) {
				result.append(line).append("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return result.toString();
	}

	public static String doPost(String url, String param) {
		return doPost(url, param, Encoding.UTF_8);
	}

	public static String doPost(String url, String param, String encoding) {
		StringBuffer result = new StringBuffer();
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), encoding));
			String line;
			while ((line = in.readLine()) != null) {
				result.append(line).append("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result.toString();
	}

	public static String doPost(String url, Map<String, Object> param, String encoding) {
		StringBuffer paramStr = new StringBuffer();
		if (param != null && !param.isEmpty()) {
			for (Map.Entry<String, Object> entry : param.entrySet()) {
				try {
					paramStr.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue().toString(), encoding))
							.append("&");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			paramStr.deleteCharAt(paramStr.length() - 1);
		}
		return doPost(url, paramStr.toString(), encoding);
	}

	public static String doPost(String url, Object param, String encoding) {
		return doPost(url, BeanUtil.beanToString(param, BeanStringStyle.FORM), encoding);
	}
}
