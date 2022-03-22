package com.bridgelabz;

import java.util.Scanner;

public class Switch {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the date");
		int date=s.nextInt();
		switch(date)
		{
		case 1:
			System.out.println("monday");
			break ; 
		case 2:
			System.out.println("tuesday");
			break ; 
		case 3:
			System.out.println("wednesday");
			break ; 
		case 4:
			System.out.println("thusday");
			break ; 
		case 5:
			System.out.println("friday");
			break ; 
			case 6:
				System.out.println("saturday");
				break ;
				case 7:
					System.out.println("sunday");
					break ; 
					default :
					System.out.println("please enter correct option");
					
			
			
			
			
			
			
			
			
		}
		
	}

}
