package customer;

import java.util.HashMap;
import java.util.Map;

// DTO 형식으로 전달받은 데이터를 DB에 저장해야함(임시저장은 map에 저장해야하면, 프로그램 종료 하면 사라짐) 저장/조회/수정/삭제
public class CustomerDaoImpl { //DAO Data Access Object
//				KEY		 VALUE
	private Map<String, Customer> map = new HashMap<>();

	public Customer select(String id) {
		// TODO Auto-generated method stub
		return map.get(id); //id에 해당하는 값 customer
	}

	public int insert(Customer customer) {
		map.put(customer.getId(), customer);
		return 1;
	}
}
