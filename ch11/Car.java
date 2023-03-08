package ch11;

public interface Car {
	void print();
}
class Bus implements Car {
	@Override
	public void print() {
		System.out.println("나는 버스");		
	}
	void move() {
		System.out.println("정원 40명");
	}	
}

class FireEngine implements Car{
	@Override
	public void print() {
		System.out.println("나는 소방차");
	}
	void move() {
		System.out.println("불끄러");
	}
}

class Ambulance implements Car{
	@Override
	public void print() {
		System.out.println("나는 응급차");
	}
	void move() {
		System.out.println("비켜");
	}
}
class Taxi {
	public void print() {
		System.out.println("나는 택시");
	}
}

