package ch11;
//객체를 정렬하기 위해서는 Comparable을 구현해야한다.
public class Member1 implements Comparable<Member1> {
	String name;
	public Member1(String name) {
		this.name = name;
	}
// 정열할 기준을 재정의한다
	public int compareTo(Member1 o) {
		
		return name.compareTo(o.name);
	}
	
	public String toString() {
		return name;
	}
	
}
