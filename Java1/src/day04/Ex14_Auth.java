package day04;

public class Ex14_Auth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc = new MyClass();
		System.out.println("mc.a = " + mc.a);
		mc.a = 103;
		System.out.println("mc.a = " + mc.a);
//		System.out.println("mc.b = " + mc.b);  // 외부에 노출이 안 돼서 안 됨.
		System.out.println("mc.b = " + mc.getB());  // 외부에 노출이 안 돼서 안 됨.
		mc.setB(105);
		System.out.println("mc.b = " + mc.getB());
	}

}

class MyClass {
	public int a = 3;
	private int b = 5;
	
	public int getB() {
		return b;  // b의 값을 줌
	}
	
	public void setB(int b) {
		this.b = b;
	}
}