package ch11;

public class Orange {
	int sugarContent; // 당도
	public Orange(int sugarContent) {
		this.sugarContent = sugarContent;
		
	}
	public void showSugar() {
		System.out.println("당도 : " + sugarContent);
	}

}

class Apple {
	int weight; //사과무게
	public Apple(int weight) {
		this.weight = weight;
		
	}
	void showWeight() {
		System.out.println("무게 : " + weight);
	}
}
