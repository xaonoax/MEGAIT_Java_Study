package day06;

import utils.MyUtil;

public class Ex23_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOperand(100, 27);
		c.divide();
		c.setOperand(100, 0);
		c.divide();
		
		try {
			c.alwaysException();
		}
		catch(Exception e) {
			e.printStackTrace();
			// File Write
		}
		
		System.out.println(MyUtil.BOLD + "프로그램은 정상 종료되었습니다." + MyUtil.END);
	}

}

class Calculator {
	int left, right;
	
	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
//	public void divide() {
//		System.out.println("[divide()]" + (double)(left/right));  // X .0이 붙음
//		System.out.println("[divide()] " + left/(double)right);  // 앞에 붙이면 헷갈리니까 웬만하면 뒤에 (double) 붙이기
//		System.out.println("[divide()] " + left/right);  // 오류 뜸
//}
	
	public void divide() {
		try {
			System.out.println("[divide()] " + left/right);
		}
		catch(ArithmeticException ae) {
			System.out.println("잼민이는 집에 가라");
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());
			ae.printStackTrace();
		}
		finally {
			System.out.println("오류 나거나 말거나 입금하시오");
		}
	}
	
	public void alwaysException() throws Exception {
		throw new Exception("[B0001] 화났다고 했지!");  // [예외코드]는 회사마다 다름
	}
}