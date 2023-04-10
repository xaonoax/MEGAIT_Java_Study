package day02;

import java.util.Scanner;

import utils.MyUtil;

public class Ex04_Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 실행 시 입력하기
		System.out.println("작업일자 파라미터 = " + args[0]);
		
		// 2. Scanner 사용하기
		Scanner sc = new Scanner(System.in);
		MyUtil u = new MyUtil();
		u.p("이름을 입력하십시오 :");
		String name = sc.next();
		u.p("앗 당신이 바로 " + name + "이군요...!");
		
		u.p("그렇다면, 점수를 입력하십시오 :");
		float score = sc.nextFloat();
		String str = (score>60)? "짝짝짝":"으휴";
		u.p("뭐? " + score + "점? " + str);
	}
}
