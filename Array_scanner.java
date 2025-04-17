package assignment_javaprograms;

import java.util.Arrays;
import java.util.Scanner;


public class Array_scanner {
	public static void main(String[] args) { 
		
		Scanner s1=new Scanner(System.in);
		int rollno[]=new int[s1.nextInt()];
		for(int i=0; i<=rollno.length-1; i++)
		{
			System.out.println("enter the array values");
			rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		s1.close();
	}}


