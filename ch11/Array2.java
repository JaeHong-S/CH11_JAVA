package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2 {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		
		al1.add("산딸기"); al1.add("집딸기"); al1.add("판딸기"); al1.add("죽은딸기"); al1.add("알카리딸기"); al1.add("산딸기");
		
		for(int i = 0; i < al1.size() ; i++) {
			System.out.print(al1.get(i) + "\t");
		}
		System.out.println();
		
		for(String str : al1) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
		Iterator<String>its = al1.iterator(); 
		while(its.hasNext()){
			System.out.print(its.next() + "\t");
		}
	}

}
