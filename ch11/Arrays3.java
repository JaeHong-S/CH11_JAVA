package ch11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays3 {
	public static void main(String[] args) {
		Integer[] scores = {99, 97, 98, 88, 77};
		Arrays.sort(scores);
		//System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 97); //binarySearch 메서드를 이용할 때는 반드시 sort를 해야한다.
		System.out.println("찾은 인덱스 : " + index);
		//객체를 정렬하고 찾기 - Member1
		Member1 m1 = new Member1("제니1");
		Member1 m2 = new Member1("로제2");
		Member1 m3 = new Member1("니3");
		Member1 m4 = new Member1("제니제4");
		Member1[] members = {m1, m2, m3, m4};
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		
	}

}
