package assignment_javaprograms;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1=new Scanner(System.in);
		int ageofperson=S1.nextInt();
		if(ageofperson>=18) {
			System.out.println("Can vote");
			
			
		}
		else {
			System.out.println("cannot vote");
		}
	}

}
