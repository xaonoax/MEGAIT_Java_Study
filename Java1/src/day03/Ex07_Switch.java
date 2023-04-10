package day03;

import java.util.Random;

import utils.MyUtil;

public class Ex07_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
//		u.p("\033[1mSwitch Test\033[0m");  //볼드체(터미널에 그렇게 나옴)
//		u.p("\033[3mSwitch Test\033[0m");  //~체
		u.p("Switch Test");
		
		Random r = new Random();
		int i = r.nextInt(3);
		u.p(i);
		
		switch(i) {
			case 0:
				u.p("0이었구나");
				break;
			case 1:
				u.p("1이었네");
				break;
			case 2:
				u.p("This is 2");
				u.p("축 당첨 상품 증정");
				break;
			default:
				u.p("버그가 엄청나...");
		}
		
//		switch(작업단계) {
//			case "시작":
//				시작단계에서 할 일;
//			case "기본완료":
//				기본단계 다음에서 할 일;
//			case "개발완료":
//				출시준비;
//			case "출시준비완료":  // break 안 써도 됨
//				배송;
//		}
	}	
}