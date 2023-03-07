package ch11;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>(5);//용량이 5인 벡터 생성
		vec.add("1");
		vec.add("2");
		vec.add("3");
		print(vec); 
		vec.trimToSize();//데이터가 없는 공간을 삭제
		print(vec);
		vec.ensureCapacity(6) ;//용량ㅇ을 6으로 늘려
		vec.setSize(7);
		print(vec);
		vec.clear(); //  데이터 모두 삭제
		
	}

	private static void print(Vector<String> vec) {
		System.out.println(vec);
		System.out.println("갯수 : " + vec.size());
		System.out.println("용량 : "  + vec.capacity());
		
	}

}
