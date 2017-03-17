package com.wuba.alex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LRUCache<String, String> aCache = new LRUCache<>(2);
		aCache.put("aaa", "1");
		aCache.put("bbb", "2");
		System.out.println("1====="+aCache.toString());
		aCache.put("ccc", "3");
		System.out.println("2====="+aCache.toString());
		aCache.put("ccc", "2");
		System.out.println("3====="+aCache.toString());
		
	
		
		
		
	}
}
