package day06;

public class Ex21_Calculator implements Ex21_CalInterface {
	int left, right, center;
	
	public void setOperand(int f, int s, int t) {  // 변수명 달라도 타입만 같으면 됨.
		left = f;
		right = s;
		center = t;
	}
	
	public int sum() {
		System.out.println("[sum()] Called");
		return left + right + center;
	}
	
	public double avg() {
		System.out.println("[avg()] Called");
		return sum() / 3d;  // 3뒤에 D, d, . 그래야 소수점 나옴
	}
}
