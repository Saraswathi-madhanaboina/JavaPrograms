package assignment_javaprograms;

public class Constructor_overloading {
	
	Constructor_overloading(int a){
		System.out.println("xbox");
	}
	Constructor_overloading(String s){
		System.out.println("pop");
		}
	Constructor_overloading(char c){
		System.out.println("weit");
	}
	
	public static void main(String[] args) {
		 new Constructor_overloading(2);
		 new Constructor_overloading("kniff");
		 new Constructor_overloading('A');
		
	
	}
	
	

}
