package assignment_javaprograms;

public class Palindrome {
	public static void main(String[] args) {
		String name="level";
		String output="";
		for(int i=name.length()-1; i>=0;i--) {
			char a=name.charAt(i);
			output=output+a;
			System.out.println(output);
		}
		if(name.equals(output)) {
			System.out.println("The given name is paindrome");
		}
		else {
			System.out.println("The given name is not palindrome");
		}
	}

}


	