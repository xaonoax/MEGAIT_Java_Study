package day05;

public class Ex19_Parent {
	String name = "Parent";
	String familyname = "Leopard";
	
	Ex19_Parent(){
		System.out.println("Parent is created");
	}
	
	void eat() {
		System.out.println("나 " + this.name + "는 식사를 합니다.");
		System.out.println("빵 먹기");
		System.out.println("밥 먹기");
		System.out.println("음료수 먹기");
		System.out.println("연타발에서 먹기");
		
	}
	
	void shout() {
		System.out.println("[shout()] : 내 이름은 " + this.name + "!!!");  // 부모거 안 쓰고 내 거 쓸 때
		System.out.println("[shout()] : 내 이름은 " + name + "!!!");  // 부모거 안 쓰고 내 거 쓸 때
	}
}
