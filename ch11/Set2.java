package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("산딸기");
		set.add("판딸기");
		set.add("산딸기");
		set.add("죽은딸기");
		set.add("알카리딸기");
		set.add("죽은 딸기");
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("========");
		
		for(String str : set) {
			System.out.println(str);
		}
		
	}

}
