package com.sachin.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(101, 1000);
		map.put(102, 2000);
		map.put(103, 3000);
		
		System.out.println(map);
	}

}
