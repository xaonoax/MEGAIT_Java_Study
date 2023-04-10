package day01;

public class Ex02_Variable {
	public static void main(String[] args) {
		System.out.println("Variable Example");
		
		// 1. int, long, float, double
		int var1 = 30;
		long var2 = 100L;  // 100은 int타입(표준)
		float var3 = 3.008F;  // 3.008은 double타입(표준)
		double var4 = 3.008;

		//2. char
		char ch = 'a';
		char ch2 = 97;
		char ch3 = 0x61;
		System.out.println("2. ch, ch2, ch3 = " + ch + " " + ch2 + " " + ch3);
		
		//3. char를 int에 넣을 때
		int chi = ch;
		ch = (char)chi; // 큰 범위에서 작은 범위로 강제 변환(Casting)
		System.out.println("3. ch = " + ch);
		
		// 4. int, double 변환
		int int1 = 100;
		double db1 = int1;
		System.out.println("4. db1 = " + db1);
		
		double db2 = 3.14;
		int int2 = (int)db2;
		System.out.println("4. int2 = " + int2);
		
		// 5. String
		String myName = "A JY";
		System.out.println("5. My name is " + myName + "이(가) 아닙니다.");
		
		// 6. String, int, double
		String temp = "" + 3;
		temp = "" + 3.14;
		String temp2 = "3";
		String temp3 = "3.1415926421213";
		int1 = Integer.parseInt(temp2);
		db1 = Double.parseDouble(temp3);
		float fl1 = Float.parseFloat(temp3);
		System.out.println("6. int1, db2, fl1 = " + int1 + " " + db1 + " " + fl1);
		
		// 7. boolean
		boolean b = (3 < 5);
		System.out.println("7. 3 < 5 : " + b);
	}
}
