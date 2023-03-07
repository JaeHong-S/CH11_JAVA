package ch11;

import java.util.ArrayList;

public class Array3 {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("구렁이");
		al1.add("팔렁이");
		al1.add("구렁삼");
		al1.add("구렁사");
		al1.add("구렁오");
		
		prn(al1); 
		al1.add(1,"구렁오"); // index 1에 구렁이 추가 뒤로밀림
		prn(al1);
		al1.set(5, "구렁육"); // index 5번째 값을 변경
		prn(al1);
		al1.remove(4);
		prn(al1);
		al1.remove("구렁이"); //처음 발견된 "구렁이"를 지우고 인덱스가 하나씩 당겨짐
		prn(al1);

	}

	private static void prn(ArrayList<String> al1) {
		for(String snake : al1) {
			System.out.print(snake + "\t");
		}
		System.out.println();
	}

}
