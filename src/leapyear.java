import java.util.Scanner;

public class leapyear {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the year");
		int year=s.nextInt();
		if((year%4==0 &&  year%100!=0 )||(year%400==0))
		{
			System.out.println("yes leap year ");
		}
	else
	{
		System.out.println("not a leap year ");
	}
}}
