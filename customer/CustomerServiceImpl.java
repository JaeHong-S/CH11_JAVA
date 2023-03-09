package customer;

public class CustomerServiceImpl { //Business Model 업무처리
	private static CustomerDaoImpl cdi = new CustomerDaoImpl();


	public int insert(Customer customer) {
		int result = 0; // 0은 입력실패, 1은 입력 성공
//		map에 전달된 id를 가지고 읽어서, 있으면 있는 아이디입니다. 다른 것을 사용하세요, 없으면 입력
//		Customer은 console로 입력 받아서 전달 받은 데이터, customer2 는 map에서 읽어온 데이터
		Customer customer2 = cdi.select(customer.getId());  // 입력한 id로 일
		if(customer2 == null) result = cdi.insert(customer);
		else System.out.println("이미 있는 아이디입니다. 다른 것을 사용하세요");
		return result;
	}


	public Customer select(String id) {
		// TODO Auto-generated method stub
		return cdi.select(id); //id 읽어오는 것은 이미 앞에서 함
	}
}
