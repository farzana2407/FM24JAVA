package com.interviewCodeQA;

public class PracticeInterviewQA {

	public static void main(String[] args) {
		
		
	
		int a = Integer.parseInt("10");
		double c=Double.parseDouble("10.5");
		int b=a+14;
		System.out.println(c+20);
		System.out.println(b);
		String value=String.valueOf(10);
		System.out.println(value+20);
		String e="Zahanjeb";
		String d=" Zayn";
		System.out.println(e.concat( d));
		String country= "United state of America";
		System.out.println(country.contains("of"));
		String [] parts= country.split(" ");
		System.out.println(parts.length);
		for (int i = 0; i < parts.length; i++) {
				
			System.out.println(i+":"+parts[i]);
		}
		String country1= new String("United state of America");
		int count=0;
		for (int j = 0; j <country1.length(); j++) {
			if(country1.charAt(j)=='e') {
				
				System.out.println("");
				System.out.println(country1.charAt(j)+"::"+count);
				System.out.println("Index of e::"+j);
				count++;
			}
		}	
				
				
		String reverse= new StringBuffer(country).reverse().toString();
		System.out.println(reverse);
		
		//find which number contains 3 from 10-30
		
			for(int i=10;i<=30;i++) {
				if(String.valueOf(i).contains("3")) {
					System.out.println(i);
				}
			}
				
			
			
		
		
		
		
	}

}
