package assignment_javaprograms;

public class Nonstatic_14 {
void methodOne(int a) {
        System.out.println("Method One is called with value: " + a);
    }
    void methodTwo(String b) {
        System.out.println("Method Two is string: " +b);
    }
    void methodThree(double c, int e) {
        System.out.println("Method Three  number: " +c / +e);
    }
    
      void methodFour(boolean d) {
        System.out.println("Method Four is boolean: " +d);
    }
    public static void main(String[] args) {
        Nonstatic_14  n1 = new Nonstatic_14 ();
        n1.methodOne(10);
        n1.methodTwo("Hello");
        n1.methodThree(3.14, 10);
        n1.methodFour(true);
    }


	}


