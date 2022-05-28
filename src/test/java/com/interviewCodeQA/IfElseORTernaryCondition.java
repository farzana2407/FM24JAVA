package com.interviewCodeQA;

public class IfElseORTernaryCondition {

	public static void main(String[] args) {

		String myName = "Farzana";
		if (myName.contains("Far")) {
			System.out.println("found my name");
		} else {

			System.out.println("it's not my name");
		}
		//ternarry condition
		String name= myName.contains("Far")?"found my name":"false";
		System.out.println(name);
		
		
		
		
	}

}
