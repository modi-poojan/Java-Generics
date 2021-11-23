package com.genric;

public class Find_Max_Genrics {

	public void passIntegers(Integer num1, Integer num2, Integer num3) {
		
		if(num1.compareTo(num2) >=0 && num1.compareTo(num3) >=0 ) {
			System.out.println(+num1+" is the largest of all");
		}
		else if(num2.compareTo(num1) >= 0 && num2.compareTo(num3) >= 0) {
			System.out.println(+num2+" is largest of all");
		}
		else {
			System.out.println(+num3+" is larget of all");
		}
		
	}
}
