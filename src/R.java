
public class R implements Comparable<R>{
	/**
	 * 1.Show how you would use Set to find the unique elements in a List.
	 * 2.Show an example of HashMap and a TreeMap, and explain the difference. 
	 * 3.Which should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs?
	 */

	public int date;
	public String name;
	
	public R (String name, int date) {
		this.date = date;
		this.name = name;
	}

	
	public int getDate() {
		return this.date;
	}
	
	public String getName() {
		return this.name;
	}

	public int compareTo(R item) {
	
		if(name.equals(item.getName()))
			return date - item.getDate();
		
		return name.compareTo(item.getName());
	}
	
	
}




