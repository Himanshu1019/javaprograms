package javaproject;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner s=new Scanner(System.in);
		System.out.println("pleae enter the age");
		int age=s.nextInt();
		
		if(age>=18)
		{
			System.out.println("yes you can vote");
		}
		else
		{
			System.out.println("sorry you cant vote");
		}
	}

}
