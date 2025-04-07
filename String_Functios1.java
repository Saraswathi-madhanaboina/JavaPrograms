package assignment_javaprograms;

public class String_Functios1 {
	
	public static void main(String[] args) {
		String a="automation";
		int l1=a.length();
		System.out.println(l1);
	
		String input=" I name is ram ";
		System.out.println(input);
		String output=input.trim();
		System.out.println(output);
		String name1="ram";
		String name2="Ram";
		boolean b1=name1.equals(name2);
		System.out.println(b1);
		String name3="saru";
		String name4="saru";
		boolean b2=name3.equalsIgnoreCase(name4);
		System.out.println(b2);
		String name5="madhu saru";
		boolean b3=name5.contains("madhu");
		System.out.println(b3);
		String input5="madhu saru";
		String output5=input5.substring(1,6);
		System.out.println(output5);
		String input1="karan";
		String output1=input1.replace('k','v');
		System.out.println(output1);
		String sent1="saru";
		 String sent2 = "swathi";
	         String result = sent1.concat(sent2);
	     
	        System.out.println("Concatenated String: " + result);
	
		
		
	}}
	
	


