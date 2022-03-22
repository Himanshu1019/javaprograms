import java.util.Scanner;

public class stringequal {


	public static void main(String[] args) {
		// TODO Auto-generated method stubhi
		String a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the firse string");
		a=s.nextLine();
		
		System.out.println("please enter the second string");
		
		 b=s.nextLine();
		if(a.equals(b))
		{
			System.out.println("yes both strings are equal");
		}
		else
		{
			System.out.println("sorry both strings are  not equal");
		}

	}

}
