package assignment_javaprograms;
class one //parent class
{
	static void add() {
		System.out.println("add");
	}
}

public class Inheritance extends one {
	
	static void sub() {
		System.out.println("sub");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub();
		add();
		

	}

}
