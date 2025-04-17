package assignment_javaprograms;

public class Methodoverloading_16 {
	
	void combination(int a) {
		System.out.println("Non Static method1:" +a);
	}
	void combination(String s) {
		System.out.println("Non Static method1:" +s);}
	void combination(int a, char b) {
		System.out.println("Non Static method2:" +a  +b);
	}
	static void addition(double a, double b) {
		double sum=(a+b);
		System.out.println("addition=" +sum);
		}
	static void addition(double a, int b) {
		
		double sub=(a-b);
		System.out.println("subtractio=" +sub);}
	static void addition(boolean b , String s , char d) {
		System.out.println("I am= " +s);
		System.out.println("I am=" +b);
	}
	public static void main(String[] args) {
		Methodoverloading_16 m1=new Methodoverloading_16();
		m1.combination(10);
		m1.combination(12 , 'M');
		m1.combination("hello");
		addition(1234.45,344.898);
		addition(12.98,247);
		addition(true, "aru", 'h');
	}

}
