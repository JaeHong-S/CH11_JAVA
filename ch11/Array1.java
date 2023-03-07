package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {
	public static void main(String[] args) {
//		<E> = <Elemnet>
//		제네릭 : 데이터 형태를 지정하기 위하여 사용
		ArrayList<String> al1 = new ArrayList<>();
//		ArrayList 갯수가 정해지지 않음(유동적)
		al1.add("구렁이"); al1.add("팔렁이");// al1.add(888); error 문자가 아님
		al1.add("구렁삼"); al1.add("구렁사"); al1.add("구렁오"); 
		System.out.println("데이터 건수 : " + al1.size());
		for(int i = 0; i<al1.size(); i++) {
			System.out.print(al1.get(i)+ "\t");
		}
		System.out.println();
		for(String str : al1) {
			System.out.print(str + "\t");
		}
		System.out.println();
		Iterator<String> its = al1.iterator();
		while(its.hasNext()) {
			System.out.print(its.next() + "\t");
		}
	}

}
