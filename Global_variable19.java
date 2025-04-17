package assignment_javaprograms;

public class Global_variable19 {
	 int count = 0;
 void decrement() {
	        count--;
	        System.out.println("Count after decrement: " + count);
	    }
void increment() {
	        count++;
	        System.out.println("Count after increment: " + count);
	    }
 public static void main(String[] args) {
	    	Global_variable19 G1=new Global_variable19();
	    // G1.increment();
	        G1.decrement();
	        G1.increment();
	    }
	}

	