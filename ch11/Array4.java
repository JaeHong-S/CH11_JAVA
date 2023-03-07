package ch11;

import java.util.ArrayList;

public class Array4 {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();

		al1.add("산딸기");
		al1.add("집딸기");
		al1.add("판딸기");
		al1.add("죽은딸기");
		al1.add("알카리딸기");
		al1.add("산딸기");
		
		
		prn(al1);
		al1.add(2,"뱀딸기"); 
		prn(al1);
		al1.set(4, "인삼딸기"); 
		prn(al1);
		al1.remove(1);
		prn(al1);
		al1.remove("산딸기");
		prn(al1);

	}

	private static void prn(ArrayList<String> al1) {
		for(String str : al1) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
	}

}
