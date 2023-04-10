package day08.thread;

public class Ex33_MyThread2 implements Runnable {
	String name = "";
	
	Ex33_MyThread2(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				Thread.sleep(1000);
				System.out.println("[" + getName() + "]" + i);
			}
		}
		catch(Exception e ){}
	}
}
