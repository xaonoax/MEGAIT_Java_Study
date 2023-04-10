package day06;

public class Ex24_MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sendReceipt(100);
		}
		catch(MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			if(e.getMessage().substring(1, 6).equals("B0002")) {
				System.out.println("[main()] B Exception Count ++");
				System.out.println("[main()] " + e.getMessage());
				String str1 = e.getMessage().split("[|]")[0].split("]")[1];  // 특수문자에 [] 붙여야 함
				System.out.println("[main()] " + str1 + "원을 영수증처리하다니..");
			}
		}
	}

	public static void sendReceipt(int amt) throws MyException {
		if(amt > 100000000) {
			throw new MyException("[B0001] 과도한 청구금액 백퍼센트 사기");
		}
		else if(amt < 1000) {
			throw new MyException("[B0002]" + amt + "|니 돈주고 사먹어;;");
		}
		
		System.out.println("[sendReceipt()] 금액 " + amt + "가 처리되었습니다.");
	}
}


class MyException extends Exception {
	MyException(String msg) {
		super(msg);
		System.out.println("[MyException] 경잘서 고발");
		System.out.println("[MyException] 메시지 로그 기록");
		System.out.println("[MyException] 모든 전원 오프");
		System.out.println("[MyException] 전원 계약 해지");
		System.out.println("[MyException] 관련자 전원 출근(수당없음)");
	}
}