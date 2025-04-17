package assignment_javaprograms;

public class Local_variable_18 {

	
		public static void staticMethod() {
	        int staticLocalVar = 10;
	        System.out.println("Local variable in static method: " + staticLocalVar);
	    }
		void nonStaticMethod() {
	        int nonStaticLocalVar = 20;
	        System.out.println("Local variable in non-static method: " + nonStaticLocalVar);
	    }

	    public static void main(String[] args) {
	        staticMethod();

	        
	        Local_variable_18 L = new Local_variable_18();
	        L.nonStaticMethod();
	    }

	}


