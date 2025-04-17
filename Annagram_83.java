package assignment_javaprograms;

import java.util.Arrays;

public class Annagram_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="act";
		String b="cat";
		if(a.length()!=b.length()) {
			System.out.println("They are not annagram");}
			
		else { System.out.println("The length of 2strings are equal");
		}
char c1[]=a.toCharArray();
char c2[]=b.toCharArray();
System.out.println("before sorting c1:" +Arrays.toString(c1));
System.out.println("before sorting c2:"+Arrays.toString(c2));
Arrays.sort(c1);
Arrays.sort(c2);
System.out.println("After sorting c1:" +Arrays.toString(c1));
System.out.println("After sorting c2:" +Arrays.toString(c2));
boolean b1=Arrays.equals(c1, c2);
if(b1==true) {
	System.out.println("they are annagram");
}else {
	System.out.println("they are not annagram");
}
}}





