package training.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lists {


	
	
	public static void main(String[] args) {
		List<String> fruit_list = new ArrayList<String>();
		fruit_list.add("apple");
		fruit_list.add("banana");
		fruit_list.add("mango");
		fruit_list.add("apple");
		System.out.println(fruit_list);
		fruit_list.add("orange");
		System.out.println(fruit_list);
		fruit_list.remove(2);
		fruit_list.add(2, "pear");
		System.out.println(fruit_list);
		int i = 0;
		Set<String> fruit_set = new HashSet<String>();
		for(String f : fruit_list) {
			i++;
			System.out.println(i +". " + f);
			fruit_set.add(f);
		}
	
		System.out.println(fruit_set);
	}

}
