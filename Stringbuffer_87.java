package assignment_javaprograms;

public class Stringbuffer_87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb = new StringBuffer("Be positive");
        sb.append(" In your life! ");
        System.out.println("After append: " + sb);
        sb.insert(0, "Think and ");
        System.out.println("After insert: " + sb);
         sb.delete(0, 9); // Removing "Beautiful "
        System.out.println("After delete: " + sb);
        String subStr = sb.substring(4, 12);
        System.out.println("Substring: " + subStr);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println("Buffer Capacity: " + sb.capacity());
        sb.reverse(); //  original order
        sb.replace(4,12, "kind");
        System.out.println("After replace: " + sb);
    }
}


	
