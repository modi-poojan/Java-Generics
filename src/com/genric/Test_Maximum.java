package com.genric;

public class Test_Maximum{
	
	public static void main(String[] args) {
		
		System.out.println(" Welcome to Java Generics Maximum number of 3 ");
		Find_Max_Genrics call = new Find_Max_Genrics();
		call.checkIntegers(8989, 7989 , 5985);			// test case 1
		call.checkIntegers(79, 80, 59);					// test case 2				
		call.checkIntegers(50, 77, 89);					// test case 3
		
		System.out.println("\n\n\n");
		
		call.checkFloat(13.f, 6.f, 12.f);				// test case 1
		call.checkFloat(777.1f, 889.99f, 33.7f);		// test case 2				
		call.checkFloat(77.f, 445.f, 779.f);			// test case 3
		
		System.out.println("\n\n\n");
		
		call.checkString("Bananaaaaa", "Apple", "Melon");	// test case 1
		call.checkString("BMW", "MERCEDESSSSS", "VOLVO");	// test case 2
		call.checkString("ASIA", "AFRICA", "ANTARCTICAAAAA");// test case 3
	}
} 
