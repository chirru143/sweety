package abcd;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet<>();
		set.add("raghu");
		set.add("raghu");
		set.add("mohan");
		set.add("hari");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
