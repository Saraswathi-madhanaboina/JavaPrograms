package assignment_javaprograms;

import java.util.Scanner;

public class Circumference_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=s1.nextInt();
		System.out.println("enter the value of b");
		int b=s1.nextInt();
		System.out.println("enter the value of c");
		float c=s1.nextFloat();
		float Circumference=(a+b+c);
		System.out.println(Circumference);

	}

}
