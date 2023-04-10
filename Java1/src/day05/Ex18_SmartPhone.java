package day05;

public class Ex18_SmartPhone extends Ex18_Phone {

	@Override
	public void sendText(String str) {
		System.out.println(str);

	}
	
	public void installApp() {
		System.out.println("Installing App");
	}
	
	public void webSerfing() {
		System.out.println("Web Serfing");
	}
}
