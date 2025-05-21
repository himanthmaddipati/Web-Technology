package com.java.collections;

import java.util.List;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hey");
		System.out.println(list);
		list.add(1,null);
		System.out.println(list);
		list.get(2);
		System.out.println(list.get(2));
		
	}

}
