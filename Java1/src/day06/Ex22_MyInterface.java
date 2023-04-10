package day06;

public interface Ex22_MyInterface {
	int aaa = 500;
	
	void myMethod1();
	default void dMethod() {
		System.out.println("[MyInterface:dMethod()] Called");
	}
	
	static void sMethod() {
		System.out.println("[MyInterface:sMethod()] Called");
	}
}
