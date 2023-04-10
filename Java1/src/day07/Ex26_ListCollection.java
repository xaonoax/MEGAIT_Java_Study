package day07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex26_ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. ArrayList
//		ArrayList<Integer> arr = new ArrayList();  // Generic을 사용하여 타입 제한 (<타입> 타입만 들어감 없으면 아무거나 다)
		ArrayList<String> arr = new ArrayList(); 
		
		// (1) 리스트에 요소(Element) 저장
		arr.add("돈까스");
		arr.add("치킨까스");
		arr.add("쌀국수");
		arr.add("라면");
		
		System.out.println(arr);  // 리스트 전체요소 출력하기
		
		for(int i=0;i<arr.size();i++) {
			System.out.println((i+1) + "번 메뉴 : " + arr.get(i));
		}
		
		// (2) 요소 삭제
		arr.remove(1);
		arr.remove("돈까스");
		
		System.out.println("-메뉴 2개 삭제 후-");
		for(String menu : arr) {
			System.out.println(menu);
		}
		
		// (3) 요소 변경
		arr.set(0, "스파게티");  // 삭제된 거 있으면 그 다음이 0번임
		
		// (4) Iterator
		Iterator iter = arr.iterator();
		System.out.println("-메뉴 변경 후-");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// (5) size() : 요소의 갯구 구하기
		System.out.println("저희 가게의 총 메뉴는 " + arr.size() +"개 입니다.");
		
		// (6) contains() : 요소 있는지 알아보기
		System.out.println("돈까스 있나요? " + (arr.contains("돈까스")? "응" : "없어요"));
		System.out.println("라면 있나요? " + (arr.contains("라면")? "응" : "없어요"));
		
		// 2. LinkedList
		LinkedList link = new LinkedList();
		link.add("SlamDunk");
		link.add(0, "교섭");  // 이렇게 순서를 넣을 수도 있음
		link.add(1, "아바타:물의 길");
		
		System.out.println(link);
		
	}

}
