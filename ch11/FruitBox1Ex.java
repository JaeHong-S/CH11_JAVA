package ch11;
class FruitBox{
	private Object item;
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}
public class FruitBox1Ex {
	public static void main(String[] args) {
		FruitBox fb = new FruitBox();
		fb.store(new Orange(10));
		Orange orange = (Orange)fb.pullOut();
		orange.showSugar();
//		컴파일 할때는 문제가 발생하진 않았지만, 실행할때 에러발생
		fb.store(new Apple(8));
//		사과를 넣었지만, 오렌지로 형변환해서 에러 발생
//		Orange orange2 = (Orange)fb.pullOut();
//		orange2.showSugar();
		
		Apple apple = (Apple) fb.pullOut();
		apple.showWeight();
	}

}
