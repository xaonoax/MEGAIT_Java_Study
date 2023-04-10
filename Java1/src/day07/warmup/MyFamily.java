package day07.warmup;

public class MyFamily {
	
	Man son1 = new Man();
	Man daugter1 = new Man();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFamily mf = new MyFamily();
		mf.son1.math = 30;
		mf.son1.eng = 10;
		
		JinSung.makeMan(mf.son1);
		
		System.out.println("향상된 수학 점수 : " + mf.son1.math);
		System.out.println("향상된 영어 점수 : " + mf.son1.eng);
		
		JinSung.makeMan(mf.son1);
		
		System.out.println("향상된 수학 점수 : " + mf.son1.math);
		System.out.println("향상된 영어 점수 : " + mf.son1.eng);
	}

}

class Man {
	int math;
	int eng;
}

class JinSung {
	// 잡생각이 많고 친구가 너무 많아... 우리 학원으로 보내세요.
	static void makeMan(Man man) {
		man.math += 30;
		man.eng += 30;
	}
}