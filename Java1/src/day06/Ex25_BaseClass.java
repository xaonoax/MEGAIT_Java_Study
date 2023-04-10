package day06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex25_BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String, StringBuffer Performance Test
		String str1 = "";
		StringBuffer str2 = new StringBuffer("");
		System.out.println(System.currentTimeMillis());
		
		int sample = 1000;
		long start = System.currentTimeMillis();
		
		for(int i=0;i<sample;i++) {
			str1 = str1 + 1;
		}
		
		long mid = System.currentTimeMillis();
		
		for(int i=0;i<sample;i++) {
			str2.append(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("String Elapsed : " + (mid-start) + "(ms)");
		System.out.println("StringBuffer Elapsed : " + (end-mid) + "(ms)");
		
		// StringBuffer의 value 비교하기
		StringBuffer sb1 = new StringBuffer("abcde");
		StringBuffer sb2 = new StringBuffer("abcde");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));  // 위랑 똑같음
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		// Date, Calendar
		Date d = new Date();
		System.out.println();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");  // *대소문자 주의* 시간이랑 겹치면 안 되니까
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd"); 
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy/MM/dd HH:mm:ss"); // 대문자는 24시간 단위
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) +1);  // MONTH는 1 더해줘야 함.
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		// Math
		System.out.println();
		System.out.println(Math.round(30.12345));  // 정수 반올림하기
		System.out.println(Math.round(30.12345 * 10) / 10f);  // 소수점 반올림하기
		
	}

}
