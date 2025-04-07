package assignment_javaprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List_93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		l1.add(76);
		l1.add(77);
		l1.add(52);
		l1.add(53);
		l1.add(null);
		System.out.println(l1);
		List l2=new ArrayList();
		l2.add("runner");
		l2.add("chaser");
		//l2.addAll(l1);
		l2.add(1, l1);
		System.out.println(l2);
		//Collections.sort(l1);
		l2.remove(1);
		System.out.println(l2);
		l2.removeAll(l2);
		System.out.println(l2);
		
		
	}

}
