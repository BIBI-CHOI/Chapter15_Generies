package ch15_generics;

public class FruitBox2 {
	public static void main(String[] args) {
		
		
		// 상자 생성
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		// 상자에 과일 담기
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		// 상자에서 과일 꺼내기
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}
}
