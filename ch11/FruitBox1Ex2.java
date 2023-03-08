package ch11;
class FruitBox2<T>{
	private T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}
public class FruitBox1Ex2 {
	public static void main(String[] args) {
		FruitBox2<Orange> fb = new FruitBox2<>();
		fb.store(new Orange(10));
		Orange orange = (Orange)fb.pullOut();
		
		orange.showSugar();
		
//		fb.store(new Apple(8)); 제네릭을 사용하면 선언할때 에러를 발견할 수 있다.
//		컴파일 할때는 문제가 발생하진 않았지만, 실행할때 에러발생
		
		FruitBox2<Apple> fb2 = new FruitBox2<>();
		fb2.store(new Apple(7));
		Apple apple = (Apple)fb2.pullOut();
		apple.showWeight();
		
	}

}
