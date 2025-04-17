package assignment_javaprograms;

public class String_fuctions2 {
	public static void main(String[] args) {
		String name="refer";
		String output="";
		for(int i=name.length()-1; i>=0;i--) {
			char a=name.charAt(i);
			output=output+a;
			System.out.println(output);
		}
	}

}
