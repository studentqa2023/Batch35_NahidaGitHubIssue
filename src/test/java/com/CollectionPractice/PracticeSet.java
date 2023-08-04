package com.CollectionPractice;

import java.util.Set;
import java.util.TreeSet;

public class PracticeSet {
public static void main(String[] args) {
Set <Integer> myset =new TreeSet<>();
myset.add(2);
myset.add(2);	
myset.add(4);
//myset.add(null);tree set not allow null
	System.out.println(myset);
}
}
