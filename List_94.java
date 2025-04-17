package assignment_javaprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class List_94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> e2 = new ArrayList<>();
        e2.add("Mani");
        e2.add("Ramu");
        e2.add("Tanu");
        e2.add("Manu");
        System.out.println("names"+e2);

        Iterator<String> i1 = e2.iterator();
        System.out.println("Iterating the collection:");
        while (i1.hasNext()) {
            System.out.println(i1.next());
            
            
            
        }
    }}


	



	
