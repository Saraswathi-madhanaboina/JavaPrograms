package assignment_javaprograms;

public class NonStaticMethodandmultipletimes
{
	void addition()
	{
		System.out.println("adding two numbers");
	}
	void subtration() {
		System.out.println("subtraction");
	}
	
	static void main() {
		System.out.println("saraswathi");
	}
	public static void main(String[] args) {
		System.out.println("My main method");
		NonStaticMethodandmultipletimes n1=new NonStaticMethodandmultipletimes ();
		n1.addition();
		n1.subtration();
		main();
	}
	}
	
	


