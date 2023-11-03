package com.saru.java;

/*
 * 
 * Arithmetic Operator
 * Bitwise Operator
 * Relational Operator
 * Logical Operator
 * 
 */

public class OperatorDemo {

	public static void main(String[] args) {
		int m = 10, n = 4;
		
		int a = m + n;
		int b = m - n;
		int c = m * n;
		int d = m / n;
		int e = m % n;
		
		e++; // post increment
		++e; // pre increment
		
		m = m + n; /* and */ m += n; /* both are same */
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		double f = (double)m / n;
		
		System.out.println(f);
		
	}

}
