package day05;

public class Ex19_SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex19_Child c = new Ex19_Child();
		c.print();
		c.printName();
		
		Ex19_Parent p = new Ex19_Parent();
		p.eat();
		c.eat();
		p.shout();
		c.shout();
	}

}
