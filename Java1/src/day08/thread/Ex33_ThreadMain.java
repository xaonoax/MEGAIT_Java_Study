package day08.thread;

public class Ex33_ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Threa 상속
		Ex33_MyThread1 th1 = new Ex33_MyThread1("Terminator 1");
		Ex33_MyThread1 th2 = new Ex33_MyThread1("Monsters 1");
		Ex33_MyThread1 th3 = new Ex33_MyThread1();
		
		// th1, th2, th3의 run()을 수행 => 순차적으로 실행
//		th1.run();
//		th2.run();
//		th3.run();
		
		// th1, th2, th3의 start를 수행 => 독립적으로 실행, 순서는 상관 없음
//		th1.start();
//		th2.start();
//		th3.start();
		
		// 2. Runnable 구현
		Ex33_MyThread2 r1 = new Ex33_MyThread2("Terminator 2");
		Ex33_MyThread2 r2 = new Ex33_MyThread2("Monster 2");
		Ex33_MyThread2 r3 = new Ex33_MyThread2("");
		
		Thread th4 = new Thread(r1);
		Thread th5 = new Thread(r2);
		Thread th6 = new Thread(r3);
		
		th4.start();
		th5.start();
		th6.start();
		
	}

}
