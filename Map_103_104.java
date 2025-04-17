package assignment_javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_103_104{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Mango", 52);
		m1.put("apple", 62);
		m1.put("guava", 20);
		m1.put("tamarid", 46);
		System.out.println(m1);
		System.out.println("iterating the keys:");
	// fetching all the keys present in map
		for(String s : m1.keySet())
		{
			System.out.println(s);
		}
		System.out.println("iterating the values:");
	// fetching all the keys present in map
		for(Integer i: m1.values()){
			System.out.println(i);
			}
		//fetching 
		System.out.println("Iterating all keys and values");
		for(Entry<String, Integer> e1 :m1.entrySet()) {
			System.out.println(e1);
		}

	}}

	


