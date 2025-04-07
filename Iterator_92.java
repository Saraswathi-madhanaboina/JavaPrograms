package assignment_javaprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> names = new ArrayList<>();
        names.add("Mani");
        names.add("Ramu");
        names.add("Tanu");
        names.add("Manu");
        System.out.println("names"+names);

        Iterator<String> iterator = names.iterator();
        System.out.println("Iterating the collection:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


	}


