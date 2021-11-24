package com.genric;

public class Test_Maximum{
	
	public static void main(String[] args) {
		
		System.out.println(" Welcome to Java Generics Maximum number of 3 ");
		
		Find_Max_Genrics.testMaximum(8989, 7989 , 5985);				// test case 1
		Find_Max_Genrics.testMaximum(79, 80, 59);					// test case 2				
		Find_Max_Genrics.testMaximum(50, 77, 89);					// test case 3
		
		System.out.println("\n\n\n");
		
		Find_Max_Genrics.testMaximum(13.f, 6.f, 12.f);				// test case 1
		Find_Max_Genrics.testMaximum(777.1f, 889.99f, 33.7f);		// test case 2				
		Find_Max_Genrics.testMaximum(77.f, 445.f, 779.f);			// test case 3
		
		System.out.println("\n\n\n");
		
		Find_Max_Genrics.testMaximum("Bananaaaaa", "Apple", "Melon");	// test case 1
		Find_Max_Genrics.testMaximum("BMW", "MERCEDESSSSS", "VOLVO");	// test case 2
		Find_Max_Genrics.testMaximum("ASIA", "AFRICA", "ANTARCTICAAAAA");// test case 3
	}
} 
