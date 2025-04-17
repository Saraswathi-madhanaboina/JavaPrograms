package assignment_javaprograms;

public class Try_catch {
	
	public static void main(String[] args) {
		try {
		int a=1/0;
		System.out.println(a);  
	}
	catch(ArithmeticException w1) {
	System.out.println("Handled the exception");
	}
	}}
	


