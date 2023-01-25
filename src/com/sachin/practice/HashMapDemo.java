package com.sachin.practice;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(101, 1000);
		map.put(102, 2000);
		map.put(103, 3000);
		
		java.util.Iterator<java.util.Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
		
		while (itr.hasNext()) {
					
			java.util.Map.Entry<Integer, Integer> next = itr.next();
			
			Integer key = next.getKey();
			System.out.println(next.getKey());
			System.out.println(next.getValue());
	}

	}
}
