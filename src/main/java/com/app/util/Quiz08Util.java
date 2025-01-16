package com.app.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;

public class Quiz08Util {

	
	public static Cookie createCookie(String name, String value) {
		
		Cookie ck = new Cookie(name, encodeCookieValue(value));
		return ck;
	}

	
	private static String encodeCookieValue(String value) {
		
		try {
			return URLEncoder.encode(value, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
