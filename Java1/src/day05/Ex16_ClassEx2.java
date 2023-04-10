package day05;

public class Ex16_ClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Black", "Mustang", "Full");
		Car c2 = new Car();  // 위 아래 둘 다 작동 됨.
//		c2.color = "Red";
		c2.setColor("Red");  // set 쓰면 이렇게 해야 함.
		
		Object o = new Object();
//		System.out.println(o.toString());
//		System.out.println(o.toString().getClass());  // 위에거 응용, 소속 이름
//		System.out.println(o.toString().getClass().getSimpleName());  // 위에거 응용
		System.out.println(c2.getClass().getSimpleName());  // 이렇게도 가능 너..뉘기야
		System.out.println(c2.toString());

	}
}


class Car{
	private String color;
	private String name;
	private String type;
	
	Car(String color, String name, String type){
		this.color = color;
		this.name = name;
		this.type = type;
		
	}
	
	Car(){
		this("미정", "개발중", "기본형");  //위에 거 호출 됨.
//		this.color = "미정";
//		this.name = "개발중";
//		this.type = "기본형";
	}
	
	public String toString() {
		String str = "저의 색상은" + color + "이고, 이름은 " + name + "이며, 타입은 " + type + "입니다.";
		return str;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}

