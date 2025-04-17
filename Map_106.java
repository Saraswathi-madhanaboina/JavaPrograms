package assignment_javaprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> s1=new HashMap<>();
		s1.put("Ram", 12);
		s1.put("sam", 13);
		s1.put("pan", 15);
		s1.put("bun", 16);
		System.out.println("Iterating all keys and values");
		Set<Entry<String, Integer>>e1 =s1.entrySet();
		Iterator<Entry<String,Integer>> s2=e1.iterator();
		while(s2.hasNext()) {
			System.out.println(s2.next());
		}
        
    }
		

	}


