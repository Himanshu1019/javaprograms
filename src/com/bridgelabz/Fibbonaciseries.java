package com.bridgelabz;

import java.util.Scanner;

public class Fibbonaciseries {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i=0;
int first=0;
int second=1;
int third;
Scanner s=new Scanner(System.in);
System.out.println("please enter the count");
int count=s.nextInt();
System.out.println(" "+first);
System.out.println(" "+second);

while(i<=count)
	{
		third=first+second;
		System.out.println(" "+third);
		first=second;
		second=third;
		i++;
	}

	}

}
