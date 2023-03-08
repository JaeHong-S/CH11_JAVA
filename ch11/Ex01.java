package ch11;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> kyo = new ArrayList<>();
		ArrayList<Integer> hap = new ArrayList<>();
		ArrayList<Integer> cha = new ArrayList<>();
		ArrayList<Integer> cha2 = new ArrayList<>();
		
		list1.add(1); list1.add(2); list1.add(3); list1.add(4); 
		list2.add(5); list2.add(6); list2.add(3); list2.add(4); 
		
		kyo.addAll(list1); 
		kyo.retainAll(list2); //list2와 겹치는 것만 남겨
		hap.addAll(list1);
		hap.removeAll(list2); //list2와 겹치는것들 지워
		hap.addAll(list2);//list2 싹다 가지와
		cha.addAll(list1);
		cha.removeAll(list2);
		cha2.addAll(list2);
		cha2.removeAll(list1);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(kyo);
		System.out.println(hap);
		System.out.println(cha);
		System.out.println(cha2);
		
		
	}

}
