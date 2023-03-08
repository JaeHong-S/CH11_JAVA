package ch11;

class GeneT<T> { // 객체 선언/생성 할 때, T의 데이터형이 결정된다
	T[] v;
	public void set(T[] v) {
		this.v = v;
	}
	public void print() {
		for(T s: v) {
			System.out.println(s);
		}
	}
}

public class GenericEx1 {
	public static void main(String[] args) {
		GeneT<String> gt = new GeneT<>();
		String[] ss = {"대박", "사건", "꺼이꺼이"};
		gt.set(ss);
		gt.print();
		System.out.println("==============");
		GeneT<Integer> gt2 = new GeneT<>();
		Integer[] II = {11,44,55,66};
		gt2.set(II);
		gt2.print();
	}

}
