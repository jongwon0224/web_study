package com.app.side;

import java.util.HashMap;
import java.util.Map;

public class SessionConcept {

	// 세션 개념 설명 및 동작원리
	public static void main(String[] args) {
	
		//JSESSIONID 쿠키값 -> 내 session영역 접근 -> session.setAttribute
		//key:jsessionID값, value : 저장공간(storage)
		Map<String, SessionStorage> sessionMap = new HashMap<String, SessionStorage>();
		
		sessionMap.put("123", new SessionStorage());
		
		SessionStorage session = sessionMap.get("123");
		session.setAttribute("sessionMsg", "여기다 관리");
	}
}

class SessionStorage {
	
	Map<String, String> storage;
	
	public SessionStorage() {
		storage = new HashMap<String, String>();
	}
	
	public void setAttribute(String key, String value) {
		storage.put(key, value);
		
	}
	
	public void removeAttribute(String key) {
		storage.remove(key);
	}
	
	public void invalidate() {
		storage.clear();
	}
	
	
	
	
}