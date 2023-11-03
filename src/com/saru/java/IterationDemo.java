package com.saru.java;

/*
 * 
 * while
 * do-while
 * for
 * for-each
 * 
 */

public class IterationDemo {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
		// while loop
		while(i <= 5) {
			System.out.println(i);
			
			i++;
		}
		
		// do-while loop
		do {
			System.out.println(j);
			
			j++;
		}while(j <= 5);
		
		// for loop
		for(int k = 1;k <= 5;k++) {
			System.out.println(k);
		}
		
		int x[] = { 10, 20, 30, 40, 50 };
		
		// fore-each
		for(int l : x) {
			System.out.println(l);
		}
	}

}
