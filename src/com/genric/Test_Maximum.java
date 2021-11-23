package com.genric;

public class Test_Maximum{
	
	public static void main(String[] args) {
		
		System.out.println(" Welcome to Java Generics Maximum number of 3 ");
		Find_Max_Genrics call = new Find_Max_Genrics();
		call.passIntegers(8989, 7989 , 5985);	// test case 1
		call.passIntegers(79, 80, 59);			// test case 2				
		call.passIntegers(50, 77, 89);			// test case 3
	}
} 
