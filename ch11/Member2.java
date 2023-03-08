package ch11;

public class Member2 implements Comparable<Member2>{
	String name;
	int age;
	public Member2(String name, int age) {
		this.name = name; this.age =age;
	}
//	비교하는 기준
	public int compareTo(Member2 o) {
		//비교대상은 문자열이어야 하기 떄문에, age를 문자열로 바꿔줌.
		String age1 = age + "";
		String age2 = o.age + "";
		return age1.compareTo(age2);
		//return name.compareTo(o.name);
	}
	
	public String toString() {
		return name + "(" + age + ")";
	}

}
