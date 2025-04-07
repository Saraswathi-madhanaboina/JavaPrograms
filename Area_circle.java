package assignment_javaprograms;

import java.util.Scanner;

public class Area_circle {
	
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the value of PI");
		double pi=s1.nextDouble();
		System.out.println("Enter the value of r");
		int r=s1.nextInt();
         double Area=pi*r*r;
         System.out.println(Area);
			
		
	}

}
