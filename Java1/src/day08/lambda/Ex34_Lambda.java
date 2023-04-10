package day08.lambda;

import java.util.ArrayList;
import java.util.function.DoubleUnaryOperator;

public class Ex34_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Standard
		CalculableClass c = new CalculableClass();
		c.calculate(100, 1000);
		// 수식이 오래됐네... 바꿔야겠다. => 본체의 변경이 필요함.
		
		
		// 2. Anonymous Instance (1. Standard를 안 바꿀 때) 
		Calculable c1 = new Calculable() {
			public void calculate(int x, int y) {
				System.out.println("[익명객체-일반]" + (x*31.4 + y));
			}
		};  // 세미콜론 붙여야 함.
		c1.calculate(100, 1000);
		
		// 3. Anonymous Instance 2
		// 다른 메서드의 인풋으로 인페이스가 들어갈 때
		Ex34_Lambda l = new Ex34_Lambda();
		l.action1(new Calculable() {
			public void calculate(int x, int y) {
				System.out.println("[익명객체-메서드인풋]" + (x*31.4 + y));
			}
		});
		
		// 4. lambda - 1 : 람다식으로 정의하면 자동으로 메서드와 메핑 - a, b 이름 상관 없음
		// 인터페이스가 메서드를 단 1개만 가지고 있음
		Calculable c2 = (a, b) -> { System.out.println("[람다-정식]" + (a*31.4 + b)); };
		c2.calculate(100,1000);
		
		// 5. lambda - 2 : 람다식이 다른 메서드의 인풋으로 들어갈 때 - a, b 이름 상관 없음
		l.action1((x, y) -> { System.out.println("[람다-파라미터]" + (x*31.4 + y)); });
		
		// 6. return 값이 있는 lambda
		l.action2((x) -> { return x * 31.4; });
		
		// 7. 인풋이 1개라면 괄호 생략
		l.action2(x -> { return x * 31.4; });
		
		// 8. 결과물이 return 	1줄이면 그냥 다 생략
		l.action2(x -> x * 31.4);
		
		// 9. Java에서 제공하는 인터페이스 UnaryOperator, BinaryOperator
		// Unary : 한 개 들어가서 한 개 나옴, Binary : 두 개 들어가서 한 개 나옴.
		DoubleUnaryOperator oper;
		oper = (n) -> Math.abs(n);
		System.out.println("[람다-Unary]" + oper.applyAsDouble(-5.8));
		
		// 영혼 없이 전달만 하는 경우
		oper = Math::abs;
		System.out.println("[람다-Unary2]" + oper.applyAsDouble(-5.8));
		
		// 10. Java에서 제공하는 인터페이스 Consumer
		ArrayList<String> arr = new ArrayList();
		arr.add("Java Study");
		arr.add("Sleeping");
		arr.add("Having Dinner");
		
		arr.forEach(x -> { System.out.println("[람다-Consumer] " + x); });  // arr에서 하나씩 꺼냄
		arr.forEach(System.out::println);
		
		// 11. Thread에서 사용하는 대표적인 람다 인터페이스 Runnable void run()
		Runnable r = () -> {
			for(int i=0;i<15;i++) {
				try {
					Thread.sleep(1000);;
				}
				catch(Exception e) {}
				System.out.println("[람다-Runnable] " + i);
			}
		};
		
		Thread th = new Thread(r);
		th.start();
		
	}

	public void action1(Calculable cal) {
		int x = 100;
		int y = 1000;
		cal.calculate(x, y);
		
		
	}
	
	public void action2(CalculableReturn calr) {
		int x = 100;
		double y = calr.calculate(x);
		System.out.println("[람다-리턴값]" + y);
	}
	
}
