package assignment_javaprograms;

import java.util.ArrayList;
import java.util.Collection;

public class Upcasting_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		c1.add(23);
		c1.add("saru");
		c1.add(12.12);
		c1.add("A");
		System.out.println(c1);
		Collection c2= new ArrayList();
		c2.addAll(c1);
		c2.add(12);
		c2.add("hlo");
		
		System.out.println(c2);
		c2.remove(12);
		
		System.out.println(c2);
		boolean b1=c2.contains("hlo");
		System.out.println(b1);
		Collection<Integer>c3=new ArrayList<Integer>();
		c3.add(100);
		c3.add(50);
		c3.add(86);
		System.out.println(c3);

	}

}
