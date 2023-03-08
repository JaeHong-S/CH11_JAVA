package ch11;

import java.util.Arrays;
import java.util.Collections;

public class ArraysMember2 {
	public static void main(String[] args) {
		Member2 m1 = new Member2("가", 16);
		Member2 m2 = new Member2("나", 15);
		Member2 m3 = new Member2("다", 14);
		Member2 m4 = new Member2("라", 12);
		Member2 m5 = new Member2("마", 19);
		
		Member2[] members = {m1, m2, m3, m4, m5};
		System.out.println(Arrays.toString(members));
		
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println(Arrays.toString(members));

	}

}
