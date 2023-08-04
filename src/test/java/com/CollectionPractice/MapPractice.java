package com.CollectionPractice;

import java.util.HashMap;
import java.util.Map;

import org.testng.collections.MultiMap;

public class MapPractice {
public static void main(String[] args) {
Map<String,String> myMap = new HashMap<>();	

myMap.put("Name", "null");	
myMap.put("Salary", "null");	
myMap.put("Name", "Safwan");
myMap.put("Address", "Queens");
myMap.put("House", "Queens");
//Map can allow duplicate valu not duplicate key
//only Multymap allow duplicate allow dupplicate keys
System.out.println(myMap);
}



}
