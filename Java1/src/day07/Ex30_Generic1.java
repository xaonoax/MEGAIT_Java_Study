package day07;

import java.util.ArrayList;

public class Ex30_Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OldBox ob = new OldBox();
		NewBox<Food> nb = new NewBox();  // 내가 설정한 데이터 타입
		
		Food ramen = new Food("라면", "그냥 끓여");
		ob.add(ramen);
		nb.add(ramen);
		
//		ob.get(0).getRecipe();  // 오류나는 이유는 Object로 리턴을 받으므로
		System.out.println( ((Food)ob.get(0)).getRecipe() );
		System.out.println( nb.get(0).getRecipe() );
		
		StrangeBox<String> sb = new StrangeBox();
	}

}

class Food {
	String name;
	String recipe;
	
	Food(String name, String recipe) {
		this.name = name;
		this.recipe = recipe;
	}
	
	String getRecipe() {
		return recipe;
	}
}

class OldBox {
	ArrayList item = new ArrayList();
	
	void add(Object o) { item.add(o); }
	Object get(int index) { return item.get(index); }
}

class NewBox<T> {  // 데이터 타입 내가 결정함
	// T, E, (K, V) : T=Type, E=Element, K=Key, V=Value (권고사항) 꼭 한 글자로 안 해도 됨
	ArrayList<T> item = new ArrayList();
	
	void add(T o) { item.add(o); }
	T get(int index) { return item.get(index); }
}

class StrangeBox<DisneyLand> {
	DisneyLand name;
}
