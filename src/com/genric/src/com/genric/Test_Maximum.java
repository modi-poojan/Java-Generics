package com.genric;

public class Test_Maximum{
	
	public static void main(String[] args) {
		
		System.out.println(" Welcome to Java Generics Maximum number of 3 ");
	
		Find_Max_Genrics callint = new Find_Max_Genrics(8989, 7989 , 5985);				// test case 1
		callint.testMaximum();
		Find_Max_Genrics callint2 = new Find_Max_Genrics(79, 80, 59);					// test case 2				
		callint2.testMaximum();
		Find_Max_Genrics callint3 = new Find_Max_Genrics(50, 77, 89);					// test case 3
		callint3.testMaximum();
		
		System.out.println("\n\n\n");
		
		Find_Max_Genrics callfloat = new Find_Max_Genrics(13.f, 6.f, 12.f);				// test case 1
		callfloat.testMaximum();
		Find_Max_Genrics callfloat2 = new Find_Max_Genrics(777.1f, 889.99f, 33.7f);		// test case 2				
		callfloat2.testMaximum();
		Find_Max_Genrics callfloat3 = new Find_Max_Genrics(77.f, 445.f, 779.f);			// test case 3
		callfloat3.testMaximum();
		
		System.out.println("\n\n\n");
		
		Find_Max_Genrics callString = new Find_Max_Genrics("Bananaaaaa", "Apple", "Melon");	// test case 1
		callString.testMaximum();
		Find_Max_Genrics callString2 = new Find_Max_Genrics("BMW", "MERCEDESSSSS", "VOLVO");	// test case 2
		callString2.testMaximum();
		Find_Max_Genrics callString3 = new Find_Max_Genrics("ASIA", "AFRICA", "ANTARCTICAAAAA");// test case 3
		callString3.testMaximum();
	}
} 
