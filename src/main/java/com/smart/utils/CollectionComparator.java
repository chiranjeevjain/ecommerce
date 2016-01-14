package com.smart.utils;

import java.util.Comparator;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class CollectionComparator implements Comparator {

	Log log = LogFactory.getLog(this.getClass());

	private String fieldName;
	private String sortType;

	public static final String ASC = "ASC";
	public static final String DESC = "DESC";

	public CollectionComparator(String argFieldName) {
		this.fieldName = argFieldName;
	}

	public CollectionComparator(String argFieldName, String sortType) {
		this.fieldName = argFieldName;
		this.sortType = sortType;
	}

	private Object getValue(Object a) {
		Object obj = null;
		Class[] obj1 = null;
		Object[] obj2 = null;
		String methodName = "get" + StringUtils.capitalize(fieldName);
		try {
			obj = a.getClass().getMethod(methodName, obj1).invoke(a, obj2);
		} catch (Exception ex) {
			log.warn(ex);
		}
		return obj;
	}

	public int compare(Object obj1, Object obj2) {
		int status = 0;
		try {
			Object obj1Val = getValue(obj1);
			Object obj2Val = getValue(obj2);
			if (obj1Val != null && obj1Val instanceof Comparable
					&& obj2Val != null) {
				Comparable comp1 = (Comparable) obj1Val;
				status = comp1.compareTo(obj2Val);
			} else if (obj1Val == null) {
				status = -1;
			} else if (!(obj1Val instanceof Comparable)) {
				log.warn("The object " + obj1Val.getClass()
						+ "does not implements Comparable");
			}
			if (DESC.equalsIgnoreCase(sortType)) {
				status = status * -1;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;

	}
}