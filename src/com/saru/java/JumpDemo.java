package com.saru.java;

/*
 * 
 * Break
 * Continue
 * 
 */

public class JumpDemo {

	public static void main(String[] args) {
		for(int i = 1;i <= 10;i++) {
			if(i == 4) {
				continue; // continue without 4
			}
			
			if(i == 8) {
				break; // when i = 4 loop terminate
			}
			
			System.out.println(i);
		}
	}

}
