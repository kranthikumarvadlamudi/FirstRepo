package CoreJava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		
             Scanner s = new Scanner(System.in);
		
             System.out.print("Enter month name : ");

             String monthName;

            monthName = s.next();

             switch (monthName) {

             case ("January"):
            	 
                   System.out.println("it is 1st month of the year");

                   break;

             case ("February"):

                   System.out.println("it is second month of the year");

                   break;

             case ("March"):

                   System.out.println("it is 3rd month of the year");

                   break;

             case ("April"):

                   System.out.println("it is 4th month of the year");

                   break;

             case ("May"):

                   System.out.println("it is 5th month of the year");

                   break;

             case ("June"):

                   System.out.println("it is 6th month of the year");

                   break;

             case ("July"):

                   System.out.println("it is 7th month of the year");

                   break;

             case ("August"):

                   System.out.println("it is 8th  month of the yearAugust");

                   break;

             case ("September"):

                   System.out.println("it is 9th month of the year");

                   break;

             case ("October"):

                   System.out.println("it is 10th month of the year");

                   break;

             case ("November"):

                   System.out.println("it is 11th month of the year");

                   break;

             case ("December"):

                   System.out.println("it is 12th month of the year");

                   break;

             default:

                   System.out.println("Invalid month.");

                   break;
             }
	}
}


