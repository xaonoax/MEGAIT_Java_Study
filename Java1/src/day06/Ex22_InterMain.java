package day06;

public class Ex22_InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex22_MyClass1 c1 = new Ex22_MyClass1();
		
		System.out.println(c1.aaa);
		System.out.println(Ex22_MyInterface.aaa);  // ITALIC체는 static이라는 걸 의미함, static은 구현 안 해도 가능
		
		Ex22_MyClass2 c2 = new Ex22_MyClass2();
		c2.dMethod();
		c2.sMethod();  // 아래와 동일
		Ex22_MyClass2.sMethod();
		Ex22_MyInterface.sMethod();  // 직접 호출
	}

}
