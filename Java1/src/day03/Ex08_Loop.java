package day03;

import utils.MyUtil;

public class Ex08_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		
		//1. while test
		u.p("1. while");
		
		int i = 0;
		while(i < 10) {
			u.p("이번 i는 " + i);
			i++;
		}
		
		// infinity loop
		i = 0;
		while(true) {
			u.p("이번 i는 " + i);
			i++;
			if(i > 10000) {
				break;
			}
		}
		
		// 2. for test
		for(int j=0; j<10; j++) {  // ;뒤에 한 칸 띄어 쓰는게 표준
			u.p("이번 j는 " + j);
		}
		
		// u.p("Final j는 " + j);  // j는 for문 내에서 선언되어 for문 종료시 소멸된다.
		
		int k = -100; // for문 밖
		
		for(k=0; k<10; k++) {
			u.p("[1]이번 k는 " + k);
		}
		
		u.p("[1]Final k는 " + k);  // 1. 10(정답), 2. -100, 3. 11 / k++적용함
		
		for(k=0; k<10; k++) {
			u.p("[2]이번 k는 " + k);
			k = 10000;			
		}
		
		u.p("[2]Final k는 " + k);  // 1. 10000, 2. 10001(정답), 3. 0
		
		// 3. do ~ while
		u.p("3. do while");
		
		int l = 100;
		do {
			u.p("[3]이번 l은 " + l);
			l++;
		} while(false);
		
		// 4. break
		// while과 break를 사용하여
		// 1에서 100까지를 출력하되
		// 3의 배수는 빼고 출력하는 로직을 작성하기
		int m = 1;
		while(true) {
			if(m%3 != 0) {
				u.p("[4]이번 m은 " + m);
			m++;
			if(m>100)
				break;
			}
		}
	}
}