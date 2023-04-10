package day04;

public class Ex13_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c = new Calc();
		c.add(3, 5);
		c.add(4.3F, 1.8F);
		int[] aaa = {1, 3, 5, 7, 9};
		 System.out.println("[add(int[])] : " + c.add(aaa));
	}

}

class Calc {
	public void add(int a, int b) {
		System.out.println("[add(int)] :" + (a+b));
	}
	
	public void add(float a, float b) {
		System.out.println("[add(float)] :" + (a+b));
	}
	
	public int add(int[] a) {
		int sum = 0;
		
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];

		for(int i : a)
	    	sum += i;
 	
		return sum;
	} 
}