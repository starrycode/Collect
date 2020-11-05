import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		
		HashMap<R, Integer> hashMap = new HashMap<R, Integer>();
		TreeMap<R, Integer> treeMap;
		HashSet<R> set = new HashSet<R>();
		R newYear = new R("New Year", 101);
		R halloween = new R("Halloween", 1031);
		R bDay = new R("Birthday", 1106);
		R lucky = new R("lucky", 1225);
		R christmas = new R("Christmas", 1225);
		
	/**
	 * 1.Show how you would use Set to find the unique elements in a List.
	 * 2.Show an example of HashMap and a TreeMap, and explain the difference. 
	 * 3.Which should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs? TreeMap
	 */
		System.out.println("----------Set--------------------");
		set.add(bDay);
		set.add(christmas);
		set.add(halloween);
		set.add(newYear);
		set.add(lucky);
		set.add(christmas);
		
		// See if all the 6 elements are being printed out. Set will automatically not print the duplicate elements.
		for(R item : set) {
			System.out.println(item.getName() + " " + item.getDate());
		} 
		// How to find the unique elements in a List using Set.
		System.out.println("Set contains lucky or not : " + set.contains(lucky));
		
		System.out.println("----------HashMap-----------------");
		hashMap.put(bDay, 1);
		hashMap.put(christmas, 2);
		hashMap.put(halloween, 3);
		hashMap.put(newYear, 4);
		hashMap.put(lucky, 5);
		// Print out the keys in hashMap
		for(R key : hashMap.keySet())
			System.out.println(key.getName() + " " + key.getDate() + ": " + hashMap.get(key));
		
		System.out.println("----------TreeMap-----------------");
		treeMap = new TreeMap<R, Integer>(hashMap);
		treeMap.putAll(hashMap);

		// Print out the keys and values in treeMap. TreeMap can sort the keys in hashMap so it is guaranteed that the order
		// of key, value pairs remains the same.
		for(R key : treeMap.keySet())
			System.out.println(key.getName() + " " + key.getDate() + ": " + treeMap.get(key));
	}
	
	
}
