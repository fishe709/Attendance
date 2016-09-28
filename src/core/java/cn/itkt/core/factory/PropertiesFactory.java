package cn.itkt.core.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.Resource;

public class PropertiesFactory extends PropertyPlaceholderConfigurer {

	@Override
	public void setLocations(Resource[] locations) {
		String sysName = System.getProperty("os.name").toLowerCase();
		List<Resource> newLocation = new ArrayList<Resource>();
		for (int i = 0; i < locations.length; i++) {
			String fileName = locations[i].getFilename();
			if (sysName.indexOf("linux") != -1) {
				if (fileName.contains("Win")) {
					continue;
				}
			} else {
				if (fileName.contains("Sys")) {
					continue;
				}
			}
			newLocation.add(locations[i]);
		}
		Resource[] lastResource = new Resource[newLocation.size()];
		for (int i = 0; i < lastResource.length; i++) {
			lastResource[i] = newLocation.get(i);
		}
		super.setLocations(lastResource);
	}

	private Map<String, String> resolvedProps;// 将属性保存起来   

	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
		super.processProperties(beanFactoryToProcess, props);
		resolvedProps = new HashMap<String, String>();
		for (Object key : props.keySet()) {
			String keyStr = key.toString();
			resolvedProps.put(keyStr, resolvePlaceholder(keyStr, props, PropertyPlaceholderConfigurer.SYSTEM_PROPERTIES_MODE_OVERRIDE));

		}
	}

	public Map<String, String> getResolvedProps() {
		return resolvedProps;
	}

	public void setResolvedProps(Map<String, String> resolvedProps) {
		this.resolvedProps = resolvedProps;
	}
}
