package com.saru.java;

public class SelectionDemo {

	public static void main(String[] args) {
		int n = 3;
		
		if(n == 0)
			System.out.println("Nothing");
		else if(n % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		//Ternary Operator
		String st = n == 0 ? "Nothing" : n % 2 == 0 ? "Even" : "Odd";
		System.out.println(st);
		
		//Switch
		switch(n){
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Other");	
		}
				
	}

}
