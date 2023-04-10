package day06;

import utils.MyUtil;

public class Ex21_CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CalculatorDummy c = new CalculatorDummy();
		Ex21_Calculator c = new Ex21_Calculator();  // 만들어두고 나중에 씀
		
		c.setOperand(10, 21, 30);
		System.out.println("합계는 " + MyUtil.BOLD + c.sum() + MyUtil.END);
		System.out.println("평균은 " + MyUtil.ITALIC + MyUtil.CYAN + c.avg() + MyUtil.END);
	}

}


class CalculatorDummy implements Ex21_CalInterface {
	public void setOperand(int first, int second, int third) {}
	
	public int sum() {
		return 100;
	}
	
	public double avg() {
		return 30.0;
	}
}