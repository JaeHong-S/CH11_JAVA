package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class map2 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("딸기", "달콤하다");
		hm.put("수박", "시원하다");
		hm.put("키위", "시큼하다");
		
		Set<String>keys = hm.keySet();
		for(String key : keys) {
			System.out.println(hm.get(key));
		}
		System.out.println("============");
		
		Iterator<String> it =  hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(hm.get(key));
		}
		
		
	}

}
