package day05;

public class Ex18_Phone {
	
	public void sendText(String str) {
		if(str.length() > 80)
			System.out.println("문자열이 너무 깁니다.");
		else 
			System.out.println(str);
	}
	
	public void call() {
		System.out.println("Calling");
	}
}
