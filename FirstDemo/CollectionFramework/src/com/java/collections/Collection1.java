package com.java.collections;
import java.util.*;
//import java.util.List;
import java.util.Collection;
public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> collection = new ArrayList<>();
		collection.add("Banana");
		collection.add("Apple");
		collection.forEach((element)->{
			System.out.println(element);
		});
		System.out.print(collection);
	}

}
