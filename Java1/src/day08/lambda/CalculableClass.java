package day08.lambda;

public class CalculableClass implements Calculable {
	public void calculate(int x, int y) {
		System.out.println("[일반객체] " + (x*31.4 + y));
	}
}
