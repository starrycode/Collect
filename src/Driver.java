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
	 * 3.Which should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs?
	 */
		System.out.println("----Set-----");
		set.add(newYear);
		set.add(halloween);
		set.add(bDay);
		set.add(christmas);
		set.add(lucky);
		set.add(christmas);
		System.out.println(set);
		System.out.println("Set contains lucky or not : " + set.contains(lucky));
		
		System.out.println("----HashMap-----");
		hashMap.put(newYear, 1);
		hashMap.put(halloween, 2);
		hashMap.put(bDay, 3);
		hashMap.put(christmas, 4);
		hashMap.put(lucky, 5);
		hashMap.put(christmas, 6);
		
		System.out.println(hashMap);
		// Print out the keys in hashMap
		for(R key : hashMap.keySet())
			System.out.println(key.getName() + " " + key.getDate());
		
		System.out.println("----TreeMap-----");
		treeMap = new TreeMap<R, Integer>(hashMap);
		treeMap.putAll(hashMap);
		
//		treeMap = new TreeMap<R, Integer>();
//		treeMap.put(newYear, 1);
//		treeMap.put(halloween, 2);
//		treeMap.put(bDay, 3);
//		treeMap.put(christmas, 4);
//		treeMap.put(lucky, 5);
//		treeMap.put(christmas, 6);
		System.out.println(treeMap);
		// Print out the keys in treeMap
		for(R key : treeMap.keySet())
			System.out.println(key.getName() + " " + key.getDate());
	}
	
	
}
