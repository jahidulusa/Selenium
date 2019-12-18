package com.test;

public class HomeworktwoJava {
	
	public static void main(String[] arg) {
		one();
		HomeworktwoJava obj = new HomeworktwoJava();
		obj.two();
		
	}
	
	static void one() {
		String country = "United States of America";
		System.out.println(country);
	}
	
	void two() {
		for (int i=1 ; i < 1001 ; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
			else {
				System.out.print("");
			}
		}
	}

}
