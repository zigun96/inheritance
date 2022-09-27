package sec03_methodoverriding.EX02_MethodOverriding_2;

class Animal {
	void cry() {
	}
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class MethodOverriding_2 {
	public static void main(String[] args) {
		// 각각의 타입으로 선언 + 각각의 타입으로 생성
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();

		// Animal 타입으로 선언 + 자식 클래스 타입으로 생성
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();

		// 배열로 관리
		Animal[] animals = { ab, ac, ad };
		for (Animal animal : animals) { // Animal 클래스 타입의 animal 참조변수를 생성 및 배열 animals에 있는 값들을 차례차례 대입하여라
			animal.cry();
		}
/*		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.cry(); */
		}
	}
}
