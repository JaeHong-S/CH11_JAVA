package customer;

import java.util.*;

public class Ex01 {
	private static CustomerServiceImpl csi = new CustomerServiceImpl();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String command = "";
		help();
		while(true) {
			
			System.out.println("명령어를 입력하세요");
			command = sc.nextLine();
			if( command.equals("X")) break; //프로그램 종료
			else if(command.startsWith("insert"))//insert로 시작한 명령어
//				','을 기준으로 (입력)데이터를 나누어 배열을 만들어서 insert라는 메서드 매게변수로 전달
				insert(command.split(","));
			else if(command.startsWith("select"))
				select(command.split(","));
			else if (command.startsWith("update")) 
				update(command.split(","));
			else if(command.startsWith("delete"))
				delete(command.split(","));
			else if(command.equals("list"))
				list();
			else help();
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
	private static void list() {
		Collection<Customer> list = csi.list();
		if(list == null || list.size() == 0)
			System.out.println("등록된 데이터가 없습니다");
		else {
			for(Customer customer : list) {
				System.out.println(customer);
			}
		}
		
	}
	private static void update(String[] str) {
		if(str.length != 6) {
			
			System.out.println("잘못 입력하셨습니다.");
			help();
			return;
		}
		Customer customer = new Customer(str[1],str[2],str[4],str[5], new Date());
		if(!str[2].equals(str[3])) {
			System.out.println("암호가 일치하지 않습니다");
			return;
		}
		int result = csi.update(customer);
		if (result > 0) System.out.println("업데이트 성공");
		
	}
	private static void delete(String[] str) {
		if(str.length != 2) {
			help();
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		int result = csi.delete(str[1]);
		if (result > 0) System.out.println("고객 정보 삭제 성공");
		
		
	}
	private static void select(String[] str) {
		if (str.length != 2) {		
			System.out.println("잘못 입력하셨습니다.");
			return; //메서드 종료
		}
		Customer customer = csi.select(str[1]);
		if (customer == null) System.out.println("존재 하지 않는 고객입니다.");
		else System.out.println(customer);
		
	}
	private static void insert(String[] str) {
		if (str.length != 6) {
			System.out.println("잘못 입력하셨습니다.");
			return; //메서드 종료
		}
		Customer customer = new Customer(str[1], str[2], str[4], str[5], new Date());
		if(!str[2].equals(str[3])) {
			System.out.println("암호가 일치하지 않습니다");
			return;
		}
		
		int result = csi.insert(customer);
		if (result > 0) System.out.println("고객 등록 성공");
		
	}
	private static void help() {
		System.out.println("다음 명령어 중에서 사용하세요");
		System.out.println("insert,id,암호,암호확인,이메일,이름");
		System.out.println("update,id,암호,암호확인,이메일,이름");
		System.out.println("delete,id");
		System.out.println("select,id");
		System.out.println("list");
		System.out.println("X");
		
	}
}
