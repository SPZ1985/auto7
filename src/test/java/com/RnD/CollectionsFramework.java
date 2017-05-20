package com.RnD;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CollectionsFramework {

	List myList;
	List<Integer> intList;
	
	Set mySet;
	Set<String> intSet;
	
	Map myMap;
	Map<String, String> keyMap;
	
	public void sample() {
		
		myList = new ArrayList();
		myList.add(123);
		myList.add("sdsd");
		myList.add(new CollectionsFramework());
		System.out.println("List (unspecified): " + myList);

		intList = new ArrayList<Integer>();
		intList.add(234);
		intList.add(45);
		intList.add(995);
		intList.add(83);
		System.out.println("ArrayList : " + intList);
		
		intList = new LinkedList<Integer>();
		intList.add(666);
		intList.add(89);
		System.out.println("Linked list : " + intList);
		
		intList = new Vector<Integer>();
		intList.add(05767);
		intList.add(234);
		System.out.println("Vector : " + intList);
		
		
		
	}//sample
	
}//class
