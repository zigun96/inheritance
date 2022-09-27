package sec03_methodoverriding.EX02_MethodOverriding_2;

class Animal {
	void cry() {
	}
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("±±");
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}

public class MethodOverriding_2 {
	public static void main(String[] args) {
		// ������ Ÿ������ ���� + ������ Ÿ������ ����
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();

		// Animal Ÿ������ ���� + �ڽ� Ŭ���� Ÿ������ ����
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();

		// �迭�� ����
		Animal[] animals = { ab, ac, ad };
		for (Animal animal : animals) { // Animal Ŭ���� Ÿ���� animal ���������� ���� �� �迭 animals�� �ִ� ������ �������� �����Ͽ���
			animal.cry();
		}
/*		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.cry(); */
		}
	}
}
