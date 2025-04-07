package assignment_javaprograms;

public class Stringfuctions2_85 {

	public static void main(String[] args) {
		 // Original String
        String str = "My name is Saraswathi";
        
        // Using replace()
        String replacedStr = str.replace("My", "Iam");
        System.out.println("After replace: " + replacedStr);
        
        // Using replaceAll() 
        String ReplacedallStr = str.replaceAll("\\s", "-"); // Replaces all spaces with '-'
        System.out.println("After replaceAll: " + ReplacedallStr);
        
        // Using substring()
        String substringStr = str.substring(5, 9); // Extracts "Welcome to J"
        System.out.println("Substring: " + substringStr);
        String input2="saraswathi";
        boolean b1 = input2.matches("(.*)wathi");
        System.out.println("matches:"+b1);
        // Using repeat()
        String repeatedStr = "Saru ".repeat(3);
        System.out.println("Repeated string: " + repeatedStr);
    }}


	


