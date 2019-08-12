package com.sdic.common;

import java.io.IOException;
import java.util.Arrays;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 对象转换成JSON
 *
 */
public class JSONUtil {

	/**
	 * 将对象转换成JSON字符串
	 * 
	 * @param object
	 * @param includesProperties
	 *            需要转换的属性
	 * @param excludesProperties
	 *            不需要转换的属性
	 */
	public static String toJsonByFilter(Object object, String[] includesProperties, String[] excludesProperties) {
			FastjsonFilter filter = new FastjsonFilter();// excludes优先于includes
			if (excludesProperties != null && excludesProperties.length > 0) {
				filter.getExcludes().addAll(Arrays.<String> asList(excludesProperties));
			}
			if (includesProperties != null && includesProperties.length > 0) {
				filter.getIncludes().addAll(Arrays.<String> asList(includesProperties));
			}
			return JSON.toJSONString(object, filter, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.DisableCircularReferenceDetect);
	}

	/**
	 * 将对象转换成JSON字符串
	 * 
	 * @param object
	 * @throws IOException
	 */
	public static String toJson(Object object) {
		return toJsonByFilter(object, null, null);
	}

	/**
	 * 将对象转换成JSON字符串
	 * 
	 * @param object
	 * @param includesProperties
	 *            需要转换的属性
	 */
	public static String toJsonByIncludesProperties(Object object, String[] includesProperties) {
		return toJsonByFilter(object, includesProperties, null);
	}

	/**
	 * 将对象转换成JSON字符串
	 * 
	 * @param object
	 * @param excludesProperties
	 *            不需要转换的属性
	 */
	public static String toJsonByExcludesProperties(Object object, String[] excludesProperties) {
		return toJsonByFilter(object, null, excludesProperties);
	}
	
}
