package assignment_javaprograms;

public class Staticandnonstatic {
	
	static void addition()
	{

		System.out.println("addition");
	}
	void subtraction() {
		System.out.println("subtraction");
	}

	public static void main(String[] args) {
		
		Staticandnonstatic S1=new Staticandnonstatic();
		S1.subtraction();
		addition();

	}

}
