package day07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex28_SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. HashSet
		HashSet <String> movies = new HashSet();
		
		// (1) add()로 데이터 저장
		movies.add("매트릭스");
		movies.add("존윅");
		movies.add("올드가드");
		System.out.println(movies.add("Jaws"));  // 순서 제일 먼저 나옴
		System.out.println(movies.add("Jaws"));  // 중복이라 false임
		
		System.out.println(movies);
		
		Iterator iter = movies.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// (2) remove는 Object로만 가능
		movies.remove("매트릭스");
		System.out.println("***** 삭제 후 *****");
		System.out.println(movies);
		
		Dog myDog = new Dog();
		myDog.name = "Happy";
		myDog.age = 3;
		System.out.println(myDog);
		
		HashSet<Dog> bucket = new HashSet();
		bucket.add(myDog);
		
		Dog searchDog = new Dog();
		searchDog.name = "Happy";
		searchDog.age = 3;
		bucket.remove(searchDog);
		
		System.out.println("***** 내 강아지 탈출 후 *****");
		System.out.println(bucket);  // my랑 search랑 달라서 가능
		
		// 2. TreeSet
		TreeSet ts = new TreeSet();
		ts.add("매트릭스");
		ts.add("존윅");
		ts.add("올드가드");
		ts.add("터미네이터");
		ts.add("알라딘");
		ts.add("CSI");
		
		System.out.println(ts);  // 영어(a~z)->한글(ㄱ~ㄴ) 순, 정렬돼서 나옴
		
//		TreeSet bucket2 = new TreeSet();
//		bucket2.add(myDog);  // 지금은 수행불가, 크기 비교를 할 수 없기 때문에...
							 // 클래스에서 comparator를 구현하면 가능함. *나중에 해보기
		
		TreeSet subSet1 = (TreeSet)ts.subSet("매트릭스", "존윅");  // 매트릭스부터 존윅 전까지 범위를 빼옴 (존윅 제외)
		System.out.println(subSet1);
		TreeSet subSet2 = (TreeSet)ts.subSet("매트릭스", false, "존윅", true);  // 메트릭스 제외, 존윅 포함
		System.out.println(subSet2);
	}

}

class Dog {
	String name;
	int age;
	
	public String toString() {  // toString은 웬만하면 오버라이딩하기
		return "이 강아지는 " + name + "(" + age + ")입니다.";
	}
}
