package day02;

public class Ex03_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p("Operation Example");
		
		// 1. 대입연산
		int num = 10;
		p("1. num = " + num);
		p(num);
		
		// 2. 대입연산2
		num += 10;
		p("2-1. num = " + num);
		num -= 10;
		p("2-2. num = " + num);
		
		// 3. 산술연산
		num = 5 + 5 * 2;
		p("3-1. num = " + num);
		num = 5 * (5 + 2);
		p("3-2. num = " + num);
		
		// 4. 산술연산2
		int num_of_grp = 3;
		num = 35 % num_of_grp;
		p("4. 현재 데이터는 " + num + "그룹");
		
		// 5. 산술연산3
		float numf = 10F / 4;
		p("5. numf = " + numf);
		double numd = 10 / 4F;  // float보다 double이 크므로 Casting 없이 저장됨
		num = (int)numd;
		p("5. num(casting) = " + num);
		
		// 6. 0으로 나눠보기
		// num = 10 / 0;  // 현재는 예외가 발생하나, 추후 예외처리를 통해 처리 가능 함.
		
		// 7. 증감연산
		// int a, b = 10; a는 int만 선언 됨
		int a = 10, b = 10;
		p("7-1. a = " + a + ", b = " + b);
		a++;  // a = a + 1, a += 1과 동일 / 단독일 때 증가 됨
		++b;
		p("7-1. a = " + a + ", b = " + b);
		
		int x = a++;  // int x = a; a++;이 더 좋은 방식
		int y = ++b;
		p("7-1. x = " + x + ", y = " + y);
		
		// 8. 비교연산
		a = 10;	b = 5;
		p("8-1. a == b : " + (a == b));
		int c = 7;
		//boolean result = (a > b > c); X  // (a > b) && (b > c); O
		
		// 9. 논리연산
		p("9-1. true && false => " + (true && false));
		p("9-2. true || false => " + (true || false));
		p("9-3. true ^ true => " + (true ^ true));
		p("9-4. !true => " + !true);
		
		// 10. 삼항연산
		int score = 100;
		String dad1 = score>60? "잘했어" : "쒹쒹";
		String dad2 = (score>99)? "당연" : "콱 마";
		String host1 = (score>30)? "맥주" : "쯧쯧..";
		p("10-1. dad1 = " + dad1);
		p("10-2. dad2 = " + dad2);
		p("10-3. host1 = " + host1);
		
	}

	public static void p(String str) {
		System.out.println(str);
	}
	
	public static void p(int num) {
		System.out.println(num);
	}
}
