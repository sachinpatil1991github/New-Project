package com.sachin.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(101, 1000);
		map.put(102, 2000);
		map.put(103, 3000);
		
		Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();
		
		while (itr.hasNext()) {
					
			Entry<Integer, Integer> next = itr.next();
			
			Integer key = next.getKey();
			System.out.println(next.getKey());
			System.out.println(next.getValue());
	}

}
