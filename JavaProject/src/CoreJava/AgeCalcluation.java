package CoreJava;

import java.util.Scanner;

public class AgeCalcluation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int yearOfBirth=0;
		int age;
		
		
		
	System.out.println("what is the year of birth");
	yearOfBirth = s.nextInt();
	age=2020-yearOfBirth;
	System.out.println("you are "  +  age + "  years old");
	}

}
