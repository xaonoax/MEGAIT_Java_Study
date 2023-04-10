package day08.iostream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex35_iostream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 1. FileInputStream
		System.out.println("***** FileInputStream* *****");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/day08/iostream/input.txt");  // . 현재 디렉토리 (홈 위치)
//			fis = new FileInputStream("./note/input2.txt");  // *윈도우에서 되는지 확인하기 학원 수업에서는 됨(맥에서는 다른 거 같음 확인하기)
//			fis = new FileInputStream("../input2.txt");  // .. 하나 위 디렉토리 *윈도우에서 되는지 확인하기 학원 수업에서는 됨(맥에서는 다른 거 같음 확인하기)
//			fis = new FileInputStream("../Java1/input2.txt");  // .. 하나 위 디렉토리 *윈도우에서 되는지 확인하기 학원 수업에서는 됨(맥에서는 다른 거 같음 확인하기)
//			fis = new FileInputStream(\Users\\ajy\Back-End\Java\학원\1200_web_AJY\01_Java); // *윈도우에서 되는지 확인하기 학원 수업에서는 됨(맥에서는 다른 거 같음 확인하기)
			
			int i = fis.read();
			while(i!=-1) {
				System.out.println((char)i);
				
				i = fis.read();
				
			}
			fis.close();
					
		}
		catch(Exception e) { e.printStackTrace(); }
		System.out.println();
		
		// 2. FileReader
		System.out.println("FileReader");
		FileReader fr = null;
		
		try {
			fr = new FileReader("./src/day08/iostream/input.txt");
			
			int i = fr.read();
			while(i!=-1) {
				System.out.println((char)i);
				
				i = fr.read();
				
			}
			fr.close();
			
			// 1024 글자씩 읽기
			fr = new FileReader("./src/day08/iostream/input.txt");
			int size = 1024;
			char[] buff = new char[size];
			
			while(true) {
				i = fr.read(buff);
				System.out.print(i + " ");
				System.out.println(buff);
				
				if(i!=size) break;
			}

		}
		catch(Exception e) { e.printStackTrace(); }
		finally {
			try { fr.close(); } catch(Exception e) { e.printStackTrace(); }
		}
		System.out.println();
		
		// 4. URL을 통해 HTML 가져오기
		String web = "http://naver.com";
		
		try {
			URL url = new URL(web);
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
//			br.lines().forEach(x -> System.out.println(x));
			br.lines().forEach(System.out::println);
		}
		catch (Exception e) { e.printStackTrace(); }
		
		// day08.txt를 읽어서 그대로 day08_copy.txt로 저장
		try {
			FileInputStream in = new FileInputStream("../../note/day08.txt");
			FileOutputStream out = new FileOutputStream("./src/day08/iostream/day08_copy.txt");
			
			int i = in.read();
			while(i!=-1) {
				out.write((char)i);
				i = in.read();
			}
			
			in.close();
			out.close();
			
		}
		catch(Exception e) { e.printStackTrace(); } 
	}
		
}
