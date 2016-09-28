package cn.itkt.core.util;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.tree.DefaultAttribute;

public final class XmlUtil {

	public static Document create(String rootElementName) {
		if (rootElementName != null) {
			Document document = DocumentHelper.createDocument();
			Element rootElement = DocumentHelper.createElement(rootElementName);
			document.setRootElement(rootElement);
			return document;
		}
		return null;
	}

	public static Document create(Element rootElement) {
		if (rootElement != null) {
			return DocumentHelper.createDocument(rootElement);
		}
		return null;
	}

	public static Element createElement(String name) {
		if (name != null && !name.isEmpty()) {
			return DocumentHelper.createElement(name);
		}
		return null;
	}

	public static Element createElement(String name, String text) {
		Element element = createElement(name);
		if (element != null && text != null && !text.isEmpty()) {
			element.addText(text);
		}
		return element;
	}

	public static Element createElement(String name, Element... childElements) {
		Element element = createElement(name);
		if (element != null && childElements != null) {
			addElement(element, childElements);
		}
		return element;
	}

	public static Element createElement(String name, String text, String key, String value) {
		Element element = createElement(name, text);
		if (element != null && key != null && !key.isEmpty() && value != null) {
			element.addAttribute(key, value);
		}
		return element;
	}

	public static Element createElement(String name, String text, List<Attribute> attributes) {
		Element element = createElement(name, text);
		if (element != null && attributes != null) {
			for (Attribute attribute : attributes) {
				element.add(attribute);
			}
		}
		return element;
	}

	public static Element createElement(String name, String text, Map<String, String> attributeMap) {
		Element element = createElement(name, text);
		if (element != null && attributeMap != null) {
			for (Entry<String, String> entry : attributeMap.entrySet()) {
				element.addAttribute(entry.getKey(), entry.getValue());
			}
		}
		return element;
	}

	public static Element createElement(String name, String key, String value, Element... childElements) {
		Element element = createElement(name, null, key, value);
		if (element != null && childElements != null) {
			for (Element childElement : childElements) {
				element.add(childElement);
			}
		}
		return element;
	}

	public static Element createElement(String name, List<Attribute> attributes, Element... childElements) {
		Element element = createElement(name, null, attributes);
		if (element != null && childElements != null) {
			addElement(element, childElements);
		}
		return element;
	}

	public static Element createElement(String name, Map<String, String> attributeMap, Element... childElements) {
		Element element = createElement(name, null, attributeMap);
		if (element != null && childElements != null) {
			addElement(element, childElements);
		}
		return element;
	}

	public static Attribute createAttribute(String key, String value) {
		return new DefaultAttribute(key, value);
	}

	public static Document read(String xmlPath) {
		SAXReader saxReader = new SAXReader();
		try {
			return saxReader.read(new File(xmlPath));
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public static Document read(InputStream input) {
		SAXReader saxReader = new SAXReader();
		try {
			return saxReader.read(input);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean write(Document document, String xmlPath, String encoding) {
		try {
			FileWriter fw = new FileWriter(xmlPath);
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding(encoding);
			format.setLineSeparator("\r\n");
			XMLWriter writer = new XMLWriter(fw, format);
			writer.write(document);
			writer.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean write(Document document, OutputStream out, String encoding) {
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding(encoding);
		format.setLineSeparator("\r\n");
		try {
			XMLWriter xmlWriter = new XMLWriter(out, format);
			xmlWriter.write(document);
			xmlWriter.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void addElement(Element parentElement, Element... childElements) {
		for (Element childElement : childElements) {
			parentElement.add(childElement);
		}
	}

	@SuppressWarnings("unchecked")
	public static void removeElement(Element parentElement, String childElementName) {
		List<Element> list = parentElement.elements(childElementName);
		if (list != null) {
			for (Element element : list) {
				parentElement.remove(element);
			}
		}
	}

	public static <T> T xmlToBean(Document document, Class<T> clazz) {
		if (document == null || clazz == null) {
			return null;
		}
		return xmlToBean(document.getRootElement(), clazz);
	}

	@SuppressWarnings("unchecked")
	private static <T> T xmlToBean(Element paraentElement, Class<T> clazz) {
		T t = null;
		try {
			t = clazz.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				String fieldName = field.getName();
				Class<?> fieldType = field.getType();
				Element childElement = paraentElement.element(fieldName);
				if (childElement != null) {
					if (ClassUtil.isPrimitiveOrWrapper(fieldType) || fieldType.equals(String.class) || fieldType.equals(Date.class)) {
						BeanUtil.setProperty(t, fieldName, childElement.getText());
					} else if (fieldType.isArray()) {
						List<Element> elements = childElement.elements();
						Class<?> componentType = fieldType.getComponentType();
						int size = elements.size();
						Object childArray = Array.newInstance(componentType, size);
						for (int i = 0; i < size; i++) {
							Element element = elements.get(i);
							Array.set(childArray, i, xmlToBean(element, componentType));
						}
						field.set(t, childArray);
					} else if (Collection.class.isAssignableFrom(fieldType)) { // 暂不支持Map
						Class<?> genericClazz = ClassUtil.getFieldGenericType(field);
						Collection<Object> childCollection;
						if (List.class.isAssignableFrom(fieldType)) {
							childCollection = new ArrayList<Object>();
						} else {
							childCollection = new HashSet<Object>();
						}
						List<Element> elements = childElement.elements();
						int size = elements.size();
						for (int i = 0; i < size; i++) {
							Element element = elements.get(i);
							childCollection.add(xmlToBean(element, genericClazz));
						}
						field.set(t, childCollection);
					} else {
						field.set(t, xmlToBean(childElement, fieldType));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	public static Document beanToXml(Object bean) {
		if (bean == null) {
			return null;
		}
		return create(beanToXmlElement(bean));
	}

	private static Element beanToXmlElement(Object bean) {
		Class<?> clazz = bean.getClass();
		Element element = createElement(clazz.getSimpleName());
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			String fieldName = field.getName();
			Class<?> fieldType = field.getType();
			Object fieldValue = null;
			Element childElement = null;
			try {
				fieldValue = field.get(bean);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (fieldValue != null) {
				if (ClassUtil.isPrimitiveOrWrapper(fieldType) || fieldType.equals(String.class)) {
					childElement = createElement(fieldName, fieldValue.toString());
				} else if (fieldType.equals(Date.class)) {
					childElement = createElement(fieldName, DateUtil.dateToString((Date) fieldValue, DateStyle.YYYY_MM_DD_HH_MM_SS));
				} else if (fieldType.isArray()) {
					childElement = createElement(fieldName);
					for (int i = 0, size = Array.getLength(fieldValue); i < size; i++) {
						Object objBean = Array.get(fieldValue, i);
						childElement.add(beanToXmlElement(objBean));
					}
				} else if (Collection.class.isAssignableFrom(fieldType)) {
					childElement = createElement(fieldName);
					Collection<?> collection = (Collection<?>) fieldValue;
					for (Object objBean : collection) {
						childElement.add(beanToXmlElement(objBean));
					}
				} else {
					childElement = beanToXmlElement(fieldValue);
				}
			} else {
				childElement = createElement(fieldName);
			}
			element.add(childElement);
		}
		return element;
	}

	public static String toXmlString(Document document, String encoding) {
		StringWriter out = new StringWriter();
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding(encoding);
		format.setLineSeparator("\r\n");
		XMLWriter writer = new XMLWriter(out, format);
		try {
			writer.write(document);
			writer.close();
			return out.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String toXmlString(Element element, String encoding) {
		StringWriter out = new StringWriter();
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding(encoding);
		format.setLineSeparator("\r\n");
		XMLWriter writer = new XMLWriter(out, format);
		try {
			writer.write(element);
			writer.close();
			return out.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Document parseXml(String xmlString) {
		try {
			return DocumentHelper.parseText(xmlString);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return null;
	}
}
