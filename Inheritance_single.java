package assignment_javaprograms;

class one //parent class
{
	static void add() {
		System.out.println("add");
	}
		
	
	static void sub() {
		System.out.println("sub");
}
}

public class Inheritance_single extends one{
	static void sum() {
		System.out.println("sum");
		
	}
	static void diff() {
		System.out.println("diff");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		diff();
		add();
		sub();

	}

}
