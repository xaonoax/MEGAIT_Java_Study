package day07;

import java.util.ArrayList;

public class Ex31_Generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuxuryBox<Instrument> box1 = new LuxuryBox();
		LuxuryBox<Violin> box2 = new LuxuryBox();
		LuxuryBox<Flute> box3 = new LuxuryBox();
//		LuxuryBox<Bat> box4 = new LuxuryBox();  // extends Instrument 조건으로 인한 입구컷 당함
		
		String result = box1.<String>get("Cello");
		Bat v = box1.<Bat>get(new Bat());  // method 단위의 generic이므로 Bat도 사용 가능
	}

}

class Instrument {
	
}

class Violin extends Instrument {
	
}

class Flute extends Instrument {
	
}

class SportsTool {
	
}

class Bat extends SportsTool {
	
}

class LuxuryBox<T extends Instrument> {  //String
	ArrayList<T> item = new ArrayList();  // <> 지정 안 해주면 Object로 지정 됨
	
	public <T> T get(T str) {  // int / 함수도 generic 됨 / 특정 함수만 쓸 때
		return str;
	}
}