package day05;

public class Ex19_Child extends Ex19_Parent{
	String name = "Child";
	
	Ex19_Child(){
		System.out.println("Child is created");
	}
	
	void print() {
		String name = "Super Child";
		System.out.println("[print()] : " + name);
		System.out.println("[print()] : " + this.name);
		System.out.println("[print()] : " + familyname);
	}
	
	void printName() {
		System.out.println("[printName()] : " + name);
		System.out.println("[printName()] : " + super.name);  // 부모이름 받을 때
	}

	void eat() {
		super.eat();  // 부모의 eat 실행
		System.out.println("아이스크림 먹기");
		System.out.println("불량식품 먹기");
	}
	
	void shout() {
		System.out.println("[shout()] : 내 이름은 " + this.name + "!!!");
		System.out.println("[shout()] : 내 이름은 " + name + "!!!");
	}
}
