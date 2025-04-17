package assignment_javaprograms;

import java.util.Scanner;
class saru2{
	void ram() {
		System.out.println("ram is the coordinator");
	}
}
class Inheritance3 extends saru2{
	void add() {
		Scanner s1=new Scanner(System.in);
		int a= s1.nextInt();
		int b= s1.nextInt();
		int c=a+b;
		System.out.println(c);	}
}
class Inheritance2 extends Inheritance3{
	static void sub () {
		System.out.println("sub");
	}
	
}

public class Inheritance_multilevel extends Inheritance2 {
	
	static void sum() {
		System.out.println("sum");
	}
	public static void main(String[] args) {
		
		Inheritance_multilevel n2=new Inheritance_multilevel();
	//Inheritance3 n1=new Inheritance3();
		n2.ram();
	n2.add();
	sub();
	sum();
	}}


