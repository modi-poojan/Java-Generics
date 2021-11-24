package com.genric;

public class Find_Max_Genrics <E extends Comparable<E>> {
	
	private E var1;
	private E var2;
	private E var3;
	
	public Find_Max_Genrics(E var1, E var2, E var3) {
		
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
				
	}
	
	public void testMaximum() {
		
		E max = Find_Max_Genrics.testMaximum(var1, var2, var3);
		printMax(max);
		
	}
	
	public void printMax(E max) {
		System.out.println(max+" is the maximum value");
	}

	public static <E extends Comparable<E> > E testMaximum(E var1, E var2, E var3) {
		
		E max;
		if(var1.compareTo(var2) > 0 && var1.compareTo(var3) > 0) {
			max = var1;
			
		}
		else if(var2.compareTo(var1) > 0 && var2.compareTo(var3) > 0) {
			max = var2;
		}
		else{
			max = var3;
			
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
