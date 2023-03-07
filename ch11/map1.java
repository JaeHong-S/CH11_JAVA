package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class map1 {
	public static void main(String[] args) {
		HashMap<String, String> hm1 = new HashMap<>();
//		          키        값
		hm1.put("BTS", "010-1111-1234");
		hm1.put("뉴진스", "010-2222-1234");
		hm1.put("에스파", "010-3333-1234");
		hm1.put("블랙핑크", "010-4444-1234");
//		                             키   를 넣으면 값이 나온다.
		System.out.println(hm1.get("BTS"));
		System.out.println("===============");
		Set<String> keys = hm1.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + hm1.get(key));
		}
		
		System.out.println("==============");
		
		Iterator<String> it = hm1.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + hm1.get(key));
		
		}
	}

}
