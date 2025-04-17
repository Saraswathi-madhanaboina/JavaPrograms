package assignment_javaprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		l1.add("kuli");
		l1.add("manali");
		l1.add("ooty");
		l1.add("shimla");
		Iterator<String> i1 = l1.iterator();
        System.out.println(" Iteration using Iterator");
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator<String> i21=l1.listIterator();
		System.out.println(" Forward Iteration using Iterator");
		while (i21.hasNext())
		{
			System.out.println(i21.next());
		}
		System.out.println(" Bacward Iteration using Iterator");
		while (i21.hasPrevious())
		{
			System.out.println(i21.previous());
		}
		
		
		

		
	

	}

}
