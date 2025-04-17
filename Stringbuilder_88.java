package assignment_javaprograms;

public class Stringbuilder_88 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
	        System.out.println("Original: " + sb);
	        sb.append(" Programming");
	        System.out.println("After append: " + sb);
	        sb.insert(16, " language");
	        System.out.println("After insert: " + sb);
	        sb.delete(17, 25);
	        System.out.println("After delete: " + sb);
	        String sub = sb.substring(6, 11);
	        System.out.println("Substring (6,11): " + sub);
	        sb.reverse();
	        System.out.println("After reverse: " + sb);
             System.out.println("Capacity: " + sb.capacity());
             sb.reverse(); 
	        sb.replace(0, 4, "python");
	        System.out.println("After replace: " + sb);
	        StringBuilder sbr=new StringBuilder();
	        System.out.println(" Capacity: " + sbr.capacity());


	}
	
	
	
	

}
