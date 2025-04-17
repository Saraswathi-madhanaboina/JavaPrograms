package assignment_javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_100_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> Da = new HashMap<>();
// Adding elements to the map using put()
        Da.put(101, "Saru");
        Da.put(102, "banu");
        Da.put(103, "tanu");
        Da.put(104, "kanu");
        System.out.println("Original Map: " + Da);
       Da.putIfAbsent(103, "ramu");
        System.out.println(Da);
        System.out.println("Student with ID 102: " + Da.get(102));
        System.out.println("Contains key 103? " + Da.containsKey(103));
        System.out.println("Contains value 'Eve'? " + Da.containsValue("Eve"));
        Da.remove(104);
        System.out.println("Map after removing ID 104: " + Da);
        
        Set<Integer> keys = Da.keySet();
        System.out.println("All student IDs: " + keys);
        System.out.println("All student names: " + Da.values());

        // Iterate through map using entrySet
        System.out.println("Iterating through map:");
        for (Map.Entry<Integer, String> entry : Da.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        System.out.println("Total students: " + Da.size());
        System.out.println("Is the map empty? " + Da.isEmpty());
    }}


