package com.testGW;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    /**
	 * 判断2个字符串是否相等 ，如果2个都为空，则也相等
	 * @param str1
	 * @param str2
	 * @return
	 * @user yc	
	 * @time 2016年10月29日
	 */
	public static boolean isEquals(String str1,String str2){
		 boolean result=false;
		 if(str1!=null&&str2!=null){
			 result=str1.equals(str2);
		 }
		return result;
	}
	/**
	 * 判断字符串是否等于指定字符串中的一个
	 * @param src
	 * @param str2
	 * @return
	 */
	public static boolean isEqualsOr(String src,String... str2){
		 boolean result=false;
		 if(src!=null&&str2!=null){
			 for (int i = 0; i < str2.length; i++) {
				if(src.equals(str2[i])) {
					return true;
				}
			}
		 }
		return result;
	}
	/**
	 * 判断是否为null或空
	 * 
	 * @param param
	 * @return
	 */
	public static boolean isEmpty(String param) {
		return param == null || param.trim().length() == 0;
	}
	public static boolean hasEmpty(String... param) {
		if(param!=null&&param.length>0) {
			for (int i = 0; i < param.length; i++) {
				if(param[i]==null || param[i].trim().length()==0) {
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * 判断目前字符串数组每个字符串对象是否都为null或空，
	 * @param param
	 * @return true=所以字符串都为空，false=至少有一个不为空
	 */
	public static boolean isAllEmpty(String... param) {
		if(param!=null&&param.length>0) {
			for (int i = 0; i < param.length; i++) {
				if(param[i]!=null&&param[i].trim().length()>0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	/**
	 * list判断是否为空
	 * 
	 * @param list
	 * @return
	 */
	public static boolean isEmpty(List<?> list) {
		return list == null || list.size() == 0;
	}
	/**
	 * map判断是否为空
	 * 
	 * @param list
	 * @return
	 */
	public static boolean isEmpty(Map map) {
		return map == null || map.size() == 0;
	}
	/**
	 * 判断是否不为空
	 * 
	 * @param param
	 * @return
	 */
	public static boolean isNotEmpty(String param) {
		return param != null && param.trim().length() > 0;
	}
	/**
	 * 判断是否不为空
	 * 
	 * @param param
	 * @return
	 */
	public static boolean isNotEmpty(String... param) {
		if(param!=null&&param.length>0) {
			for (int i = 0; i < param.length; i++) {
				if(param[i]==null||param[i].trim().length()==0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}

	/**
	 * List判断是否不为null或者只是有一个值
	 * 
	 * @param list
	 * @return
	 */
	public static boolean isNotEmpty(List<?> list) {
		return list != null && list.size() > 0;
	}
	/**
	 * map判断是否不为空
	 * 
	 * @param list
	 * @return
	 */
	public static boolean isNotEmpty(Map map) {
		return map != null && map.size() > 0;
	}
	/**
	 * 首字母大写
	 * 
	 * @param name
	 * @return
	 */
	public static String FirstUpper(String name) {
		char[] cs = name.toCharArray();
		cs[0] -= 32;
		return String.valueOf(cs);

	}
}
