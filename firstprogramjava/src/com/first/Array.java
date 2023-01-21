package com.first;

import java.util.Scanner;

public class Array {
public static void main(String[]args) {
	int[]arr= new int[4];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter 4 numbers");
	for(int i=0;i<4;i++)
		arr[i]=sc.nextInt();
		
	for(int i=0;i<4;i++)
		System.out.println("arr["+i+"]="+arr[i]);
}
	
		
		
		
}
