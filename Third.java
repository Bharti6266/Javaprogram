package com.second;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
	int a;
	int b;
	System.out.println("Enter two number");
	Scanner c =new Scanner(System.in);
	a=c.nextInt();
	b=c.nextInt();
	if(a>b) {
		System.out.println(a +": is greater");	
	}
	else if (a==b) {
		System.out.println("queal");
		
	}else {
		
		System.out.println(b +": is greater");	

	}
		
		
	}
}