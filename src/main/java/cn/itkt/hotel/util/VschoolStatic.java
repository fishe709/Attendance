package cn.itkt.hotel.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Controller;

@Controller
public class VschoolStatic {
	
	private static Properties props = null;
	
	static {
		try {
			props = PropertiesLoaderUtils.loadAllProperties("vschool.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
		StaticClass.URLPATH = props.getProperty("URLPATH");
	}
	public static String getValue(String key) {
        return props.getProperty(key);
	}

}