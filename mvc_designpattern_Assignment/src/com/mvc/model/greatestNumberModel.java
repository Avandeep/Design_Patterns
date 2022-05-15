package com.mvc.model;

public class greatestNumberModel {

	public int calculateGreatestNumber(int num1, int num2) {
		
		if (num1 > num2) {
			  System.out.println(String.format("The greater number is :%s", num1));
			  return num1;
		} else {
			 System.out.println(String.format("The greater number is :%s", num2));
			 return num2;
		}
		
	}

}
