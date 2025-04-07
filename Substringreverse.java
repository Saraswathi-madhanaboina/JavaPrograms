package assignment_javaprograms;

public class Substringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abcd";
		String output="";
		for(int i=3;i>=0;i--) {
			char c1=input.charAt(i);
			System.out.println(c1);
			output=output+c1;
			System.out.println(output);
		}
		//System.out.println(output);
		//this prints the last output dcba

	}

}

