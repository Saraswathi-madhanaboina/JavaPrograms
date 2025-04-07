package assignment_javaprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_iteration97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>s1=new HashSet<String>();
		s1.add("egisg");
		s1.add("ramu");
		s1.add("dev");
		System.out.println(s1);
		Iterator<String> i1=s1.iterator();
		System.out.println("Iterating set using Iterator");
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}


	}


