package assignment_javaprograms;

import java.util.Scanner;

public class Area_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1=new Scanner(System.in);
		System.out.println("enter the breadth");
		int B=S1.nextInt();
		System.out.println("enter the height");
		int H=S1.nextInt();
		System.out.println("enter the area");
		//int Area= (B*H);
		//System.out.println(Area);
		int Circumference=2*(B*H);
		System.out.println(Circumference);
		
		

	}

}
