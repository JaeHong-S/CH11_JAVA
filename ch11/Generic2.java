package ch11;

import java.util.ArrayList;

public class Generic2 {
	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Bus());  list.add(new Ambulance());  list.add(new FireEngine());
		//list.add(new Taxi()); 에러난 이유 : Taxi class는 CAR 인터페이스를 상속받지 않아, CAR 데이터타입으로 생성 불가 
		
		for(Car car : list) {
			car.print();
			if(car instanceof Bus)
			((Bus) car).move();
			else if(car instanceof FireEngine)
				((FireEngine)car).move();
			else if(car instanceof Ambulance)
				((Ambulance)car).move();
		}

	}

}
