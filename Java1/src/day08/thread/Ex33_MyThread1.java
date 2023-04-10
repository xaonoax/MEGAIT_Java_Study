package day08.thread;

public class Ex33_MyThread1 extends Thread {
	Ex33_MyThread1() {
		
	}

	Ex33_MyThread1(String name) {
		setName(name);
	}
	
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				Thread.sleep(1000);
				System.out.println("[" + getName() + "] : " + i);
			}
		}
		catch(Exception e) {e.printStackTrace(); }
	}
}
