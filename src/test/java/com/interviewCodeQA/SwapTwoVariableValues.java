package com.interviewCodeQA;

public class SwapTwoVariableValues {
	
	//Can you create a function that will swap any two values?
	//or How to swap two variable values?

	public void getSwap(int a, int b) {
		
		System.out.println("Before swap a value :"+a);
		System.out.println("Before swap b value :"+b);
		a=a+b;  //30==> a=30 10=a,20=b
		b=a-b;  //30-20=10 ==>b=10
		a=a-b;  //30-10=20 ==>a=20
		System.out.println("After swap a value :"+a);
		System.out.println("After swap b value :"+b);
	
	
	}   
	
	public static void main(String[]args) {
		
		new SwapTwoVariableValues().getSwap(100, 200);
	}
	
	
	
	
	
}
