package day03;

import utils.MyUtil;

public class Ex09_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p("Array Test");
		
		String[] str;
		str = new String[5];
		str[0] = "AAA";
		
		String[] student1 = new String[5];
		String[] student2 = {"A","B","C","Abraham","E"};  // 이 방법이 원칙임.
		int[] score1 = new int[5];
		int[] score2 = {10, 20, 10, 30, 20};
		
		// 모든 학생들의 이름과 점수를 출력하시고.
		// Student[학생이름] : **점
		
		for(int i=0; i<student2.length; i++) {
			u.p("student[" + student2[i] + "] : " + score2[i] + "점");
		}
		
		String[][] school = {{"A","B"},{"C","D"}};
		u.p(school[0][0]);  // A학생
		u.p(school[1][0]);  // C학생
		
		// String[][][] : 지역 + 학교 + 반  -> 가능하나 잘 사용하지 않는다.
		// 한 번 만들어서 사용해보면 다음부터는 안 쓰게 됨.
		
		// Enhanced for
		for(String name : student2) {
			u.p("[Enhanced For] " + name);
		}
		
		// Enhanced for를 이용하여 school의 모든 학생의 이름을 출력하시오.
		for(String[] sclass : school) {
			for(String sname : sclass) {
				u.p("[Enhanced For2] " + sname);
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				u.p("[Nomal For] " + school[i][j]);
			}
		}
	}
}
