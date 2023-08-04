package com.CollectionPractice;

import java.util.Arrays;
import java.util.Collections;

public class PracticeArray {
public static void main(String[] args) {
int [] myArray = {1, 6, 5 ,8,7};
System.out.println(Arrays.toString(myArray));	
System.out.println("Count="+myArray.length);
System.out.println("Array to List"+Arrays.asList(myArray));
//index=4
System.out.println(myArray[4]);
//loop an array
for (int i =0;i<myArray.length;i++) {
	System.out.println(myArray[i]);	
}
//max or min number 1)convert List>>2)Collections.min()
Integer[] a = {11,22,33,44};
int max = Collections.max(Arrays.asList(a));
System.out.println("Max value ="+max);	
int min = Collections.min(Arrays.asList(a));
System.out.println("Min value ="+min);	
}	
	
	
	
	
	

}
