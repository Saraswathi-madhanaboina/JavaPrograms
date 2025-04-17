package assignment_javaprograms;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="automation";
		int l1=a.length();
		System.out.println(l1);

		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		System.out.println(a.charAt(4));
		
		String b="testing";
		
		String c1=a.concat(b);
		System.out.println(c1);
		
		a.isEmpty();
		System.out.println(a.isEmpty());
	}

}
