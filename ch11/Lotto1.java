package ch11;

import java.util.HashSet;
import java.util.Set;

public class Lotto1 {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6 ) {
			int num = (int)(Math.random() * 45) +1;
			lotto.add(num); //중복 체크 안해도 된다.
		}
		System.out.println(lotto);
	}

}
