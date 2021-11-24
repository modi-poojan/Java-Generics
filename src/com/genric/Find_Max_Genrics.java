package com.genric;

public class Find_Max_Genrics {

	public <E extends Comparable<E> > E displayMax(E var1, E var2, E var3) {
		
		E max;
		if(var1.compareTo(var2) > 0 && var1.compareTo(var3) > 0) {
			max = var1;
			System.out.println(max+" is the max");
		}
		else if(var2.compareTo(var1) > 0 && var2.compareTo(var3) > 0) {
			max = var2;
			System.out.println(max+" is the max");
		}
		else{
			max = var3;
			System.out.println(max+" is the max");
		}
		return max;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void checkIntegers(Integer num1, Integer num2, Integer num3) {
		
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
		
	public void checkFloat(Float num1, Float num2, Float num3) {
		
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
	
	public void checkString(String first, String second, String third) {
		if(first.compareTo(second) > 0 && first.compareTo(third) > 0) {
			System.out.println(" First is largest ");
		}
		else if(second.compareTo(first) > 0 && second.compareTo(third) > 0) {
			System.out.println(" Second is largest");
		}
		else
			System.out.println(" Third is largest");
	}*/

}
