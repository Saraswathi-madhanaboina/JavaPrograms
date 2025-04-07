package assignment_javaprograms;

import java.util.Arrays;

public class Count_alphabets84{
	
	static int countofalphabets=0;
	static int countofspace=0;
	static int countofnumeric=0;
	

	public static void main(String[] args) {
		String input="cm r 23";
		char[] array= input.toCharArray();
		System.out.println("Input array is:>"+Arrays.toString(array));
		for(int i=0; i<=array.length-1;i++) {
			boolean b1= Character.isAlphabetic(array[i]);
			if (b1==true)
					{
				countofalphabets++;
					}
			boolean b2=Character.isDigit(array[i]);
			if (b2==true)
			{
				countofnumeric++;
			}
			boolean b3=Character.isWhitespace(array[i]);
			if (b3==true)
			{
				countofspace++;
			}
		
		}
	
	System.out.println("count of alphabets in the array:>"+countofalphabets);
	System.out.println("count of numbers in the array:>"+countofnumeric);
	System.out.println("count of space in the array:>"+countofspace);
	int countofspeicalcharacters=input.length()-(countofalphabets+countofnumeric+countofspace);
	System.out.println("count of special characters in the array:>"+countofspeicalcharacters);
	}}
		


