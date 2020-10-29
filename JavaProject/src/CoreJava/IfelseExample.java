package CoreJava;

import java.util.Scanner;

public class IfelseExample

{

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("What is the month number?");
		
		int monthNumber = s.nextInt();
		
		if(monthNumber== 1) 
		{
			
			System.out.println("it is 1st month of the year");
		}
		else if(monthNumber==2)
		{
			System.out.println("it is 2nd month of the yaer");
		}
			
			else if(monthNumber==3) 
			{
				System.out.println("it is 3rd month of the year");
			}
		
			else {
				System.out.println("no result found");
			}
		}
	}


