package com.generi;

public class Palindrom {
	
		

		public static void main(String[] args) {
			String s1="MOM";
			//String s2= "abcdcba";
			StringBuilder rev =new StringBuilder(s1).reverse();
			System.out.println(rev);
			if(s1.equalsIgnoreCase(rev.toString())) {
				
				System.out.println("Its a palindrome ");
			}else {
				System.out.println("Not palindrome");
				
			}
				
		}		
	

}
