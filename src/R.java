import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class R {
	/**
	 * 1.Show how you would use Set to find the unique elements in a List.
	 * 2.Show an example of HashMap and a TreeMap, and explain the difference. 
	 * 3.Which should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs?
	 */
	//private R[] items = {newYear, halloween, bDay, lucky, christmas};
//	public int bDay;
//	public int halloween;
//	public int christmas;
//	public R newYear;
//	public int lucky;
	public int top;
//	public HashMap<Ra, Integer> hashMap;
//	public TreeMap<Random, Integer> treeMap;
//	public HashSet<Random> set = new HashSet<Random>();
	public int date;
	public String name;
	
	public R (String name, int date) {
		// items = new T[]; 
		// Cannot generate generic array
		this.date = date;
		this.name = name;
	}
	
	public int getDate() {
		return this.date;
	}
	
	public String getName() {
		return this.name;
	}
	
//	public boolean isFull() {
//		return top == items.length;
//	}
	
//	public boolean put(int item) {
//		if(isFull())
//			return false;
//		
//		
//		return true;
//	}
	
//	public String toString() {
//		
//		
//	}
	
	
}




