package cn.itkt.core.log;

import java.io.InputStream;
import java.util.Properties;

public class InitSystemPropertie {
	public static Properties initProp;
	public Properties initSystemProperties(String str){
		initProp = new Properties();
		InputStream in = null;
		try {
			if (str.indexOf("linux") != -1)
                in = getClass().getResourceAsStream("/SystemPropertie.properties");			
			else
				in = getClass().getResourceAsStream("/windows_SystemPropertie.properties");	
			initProp.load(in);		
			return initProp;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
