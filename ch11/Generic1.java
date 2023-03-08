package ch11;

import java.util.ArrayList;

public class Generic1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1); list.add(2); list.add("대박"); 
		list.add(4); list.add(5); list.add("사건");
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1); list2.add(2); //list2.add("대박"); 
		list2.add(4); list2.add(5); //list2.add("사건");
		System.out.println(list);
		}

}
