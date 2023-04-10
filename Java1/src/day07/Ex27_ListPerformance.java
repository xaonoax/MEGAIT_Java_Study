package day07;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex27_ListPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 가지 방법으로 함
		
		testRead();
		testInsert();
		
		
		
		// 1. read Test
		ArrayList applicant1 = new ArrayList();
		LinkedList applicant2 = new LinkedList();
		
		for(int i=0;i<100000;i++) {
			applicant1.add(i);
			applicant2.add(i);
		}
		
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			applicant1.get(i);
		}
		long mid = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			applicant2.get(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("***** read competition *****");
		long elap1 = mid - start;
		long elap2 = end - mid;
		
		System.out.println("Applicant1 : " + elap1 + "(ms)");
		System.out.println("Applicant1 : " + elap2 + "(ms)");
		System.out.println();
		
		// 2. insert
		int samples = 10000;  // 이렇게 미리 해두는게 나음
		start = System.currentTimeMillis();
		for(int i=0;i<samples;i++) { 
			applicant1.add(30000, i);
		}
		mid = System.currentTimeMillis();
		for(int i=0;i<samples;i++) { 
			applicant2.add(30000, i);
		}
		end = System.currentTimeMillis();
		
		System.out.println("***** insert competition *****");
		elap1 = mid - start;
		elap2 = end - mid;
		
		System.out.println("Applicant1 : " + elap1 + "(ms)");
		System.out.println("Applicant1 : " + elap2 + "(ms)");
		System.out.println();
		
		
	}
	
	static void testRead() {
		// 1. read Test
			ArrayList applicant1 = new ArrayList();
			LinkedList applicant2 = new LinkedList();
			
			for(int i=0;i<100000;i++) {
				applicant1.add(i);
				applicant2.add(i);
			}
				
			long start = System.currentTimeMillis();
			for(int i=0;i<100000;i++) {
				applicant1.get(i);
			}
			long mid = System.currentTimeMillis();
			for(int i=0;i<100000;i++) {
				applicant2.get(i);
			}
			long end = System.currentTimeMillis();
			
			System.out.println("***** read competition *****");
			long elap1 = mid - start;
			long elap2 = end - mid;
				
			System.out.println("Applicant1 : " + elap1 + "(ms)");
			System.out.println("Applicant1 : " + elap2 + "(ms)");
			System.out.println();
		
	}
	
	static void testInsert() {
		// 2. insert
			ArrayList applicant1 = new ArrayList();
			LinkedList applicant2 = new LinkedList();
		
			for(int i=0;i<100000;i++) {
				applicant1.add(i);
				applicant2.add(i);
			}
			
			int samples = 10000;  // 이렇게 미리 해두는게 나음
			long start = System.currentTimeMillis();
			for(int i=0;i<samples;i++) { 
				applicant1.add(30000, i);
			}
			long mid = System.currentTimeMillis();
			for(int i=0;i<samples;i++) { 
				applicant2.add(30000, i);
			}
			long end = System.currentTimeMillis();
			
			System.out.println("***** insert competition *****");
			long elap1 = mid - start;
			long elap2 = end - mid;
			
			System.out.println("Applicant1 : " + elap1 + "(ms)");
			System.out.println("Applicant1 : " + elap2 + "(ms)");
			System.out.println();	
		
		
	}

}
