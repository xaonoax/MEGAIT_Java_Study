package day04;

import utils.MyUtil;

public class Ex12_ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyUtil u = new MyUtil();
		MyUtil.p(MyUtil.BLUE + "Class Test" + MyUtil.END);
		
		Ex11_ClassPerson person1 = new Ex11_ClassPerson();
		person1.age = 900;
		person1.name = "Adam";
		
//		Ex07_Switch ss = new Ex07_Switch();
//		ss.main(null);
		
//		Ex07_Switch.main(null);  // 위 아래 둘 다 가능
		
		Ex11_ClassPerson person2 = new Ex11_ClassPerson("Poiret");
		person1.eat();  // static X
		person2.eat();
		
		person1.hit();   // static O - 각자의 특성을 고려할 필요 없음. (class 이름 직접쳐서 가능)
		person2.hit();
		Ex11_ClassPerson.hit();
		
		Car car1 = new Car();
		Car car2 = new Car("Black", "Maserati", "Luxury");
		
//		MyUtil.BLUE = MyUtil.RED;  // final 붙어서 안 되는 중, final 변수는 수정 불가
		MyUtil.GREEN = MyUtil.RED;  // final 붙어서 안 되는 중, final 변수는 수정 불가		
		MyUtil u2 = new MyUtil();
		u2.p(u2.GREEN + "세계적인 팝 그룹 u2 콘서트" + u2.END);
	}

}

class Car {  // 이 파일 안에서만 사용 가능함.
	String color;
	String name;
	String type;
	
	Car(){
		color = "미정";
		name = "비밀";
		type = "기본형";
		System.out.println("Car() Called");
	}
	
	Car(String color, String name, String type){
		this.color = color;
		this.name = name;
		this.type = type;
		System.out.println("Car(...) Called");
	}
	
	// Code Block
	static {  // 한 번만 호출됨, 최초 생성될 때
		System.out.println("static code block Called");
	}
	
	{  // 생성자가 호출될 때마다
		System.out.println("empty code block Called");
	}
}
