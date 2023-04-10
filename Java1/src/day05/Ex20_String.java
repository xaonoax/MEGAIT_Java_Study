package day05;

import utils.MyUtil;

public class Ex20_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		
		// 1. length()
		String str1 = "flkjdhldhsffhiipoahfpisf";
		String str2 = "한글은 몇 자입니까?";
		u.p("[length()] : " + str1.length() + " " + str2.length());
		
		// 2. charAt()
		String str3 = "이것도 한글이 궁금할 뿐이다.";
		u.p("[charAt()] : " + str3.charAt(5));
		
		// 3. equals(), equalsIgnoreCase()
		String str4 = "abcde";
		String str5 = "abcde";
		String str6 = new String("abcde");
		String str7 = new String("abcde");
		String str8 = new String("ABCDE");
		System.out.println("[equals()] : " + str4 == str5);  // 괄호의 유무
		System.out.println("[equals()] : " + str6 == str7);
		System.out.println("[equals()] : " + (str4 == str5));
		System.out.println("[equals()] : " + (str6 == str7));
		System.out.println("[equals()] : " + (str6.equals(str7)));
		System.out.println("[equals()] : " + (str7.equalsIgnoreCase(str8)));  // 대소문자 비교
		
		// 4. replace()
		String str9 = "Heaven helps those";
		String str10 = "helps";
//		String str11 = str9.replace(str10, "-----");  // str9번의 helps가 나오면 -----로 바꿈
		String str11 = str9.replace("e", "-----");
		u.p("[replace()] : " + str11);
		
		// 5. substring()
		String str12 = str9.substring(0, 4);
		u.p("[substring()] : " + str12);
		
		// str9의 오른쪽 다섯 글자
		String str13 = str9.substring(str9.length()-5, str9.length());
		u.p("[substring()] : " + str13);
		
		// 두 번째인 인자를 생략하면, 끝까지
		String str14 = str9.substring(1);
		u.p("[substring()] : " + str14);
		
		// 6. trim()
		u.p("[trim()] : " + "    gffjsjops    ".trim());
		
		// 7. split()
		String str15 = "Heaven helps those";
		String[] str16 = str15.split(" helps ");  // helps를 경계로 함.
		for(String s : str16) u.p("[split()] : " + s);
		
		String[] str17 = str15.split(" ");  // " "는 한 단어씩 자름
		for(String s : str17) u.p("[split()] : " + s);
		
		String[] str18 = str15.split("");  // ""를 인자로 사용하면 한 글자씩 자름
		for(String s : str18) u.p("[split()] : " + s);
		
		String[] str19 = str15.split("[ e]");  // [ ]안에 있는 글자들로 분할 [ ] or e 둘 중에 하나만 사용해도 됨
		for(String s : str19) u.p("[split()] : " + s);

		// 8. matches()
		String str20 = "010-1234-56789098765";
//		String chekExp = "[0-8]{1,25}";  //[] 문자의 종류 {} 1~25자리
		String chekExp = "[0-8-]{1,25}"; // 8 뒤에 붙은 빼기는 진짜 빼기임, 전은 ~
		boolean result = str20.matches(chekExp);
		u.p("[matches()] : " + result);
		
		String nameRule = "[A-Za-z가-힣]{1,5}";  // 문자이면서 1~5자리
		u.p("[matches()] : " + ("Paul".matches(nameRule)? "Pass" : "Fail"));
		u.p("[matches()] : " + ("Paulie".matches(nameRule)? "Pass" : "Fail"));
		
		String phoneNum = getPhoneNumber("011-3474-1122");
		u.p("[matches()] : " + phoneNum);
	}
	
	private static String getPhoneNumber(String checkString) {
		String result = "";
		// 전화번호 타입인지를 체크한다.
		// 숫자 3자리 + "-" + 숫자 3~4자리 + "-" + 숫자 4자리
		// 전화번호 타입인 경우 마지막 4자리를 **** 처리
		// 전화번호 타입이 아니면 "올바른 타입이 아닙니다."
		String checkRule = "[0-9]{3}[-]{1}[0-9]{3,4}[-]{1}[0-9]{4}";
		if(checkString.matches(checkRule)) {
//			011-1234-1234면 1234가 다 *로 됨 그걸 방지하려면 아래처럼 하셈
			String prefix = checkString.substring(0, checkString.length()-4);
			result = prefix + "****";
		}
		else {
			result = "올바른 타입이 아닙니다.";
		}
		return result;
	}

}
