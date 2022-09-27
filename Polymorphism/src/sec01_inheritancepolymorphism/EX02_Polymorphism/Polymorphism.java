package sec01_inheritancepolymorphism.EX02_Polymorphism;

// ��� ���� �����
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphism {
	public static void main(String[] args) {
		// A Ÿ���� �پ��� ǥ��
		A a1 = new A(); // A�� A�̴�.(O)
		A a2 = new B(); // B�� A�̴�.(O)
		A a3 = new C(); // C�� A�̴�.(O)
		A a4 = new D(); // D�� A�̴�.(O)
		
		// B Ÿ���� �پ��� ǥ��
//		B b1 = new A(); // A�� B�̴�.(X)
		B b2 = new B(); // B�� B�̴�.(O)
		B b3 = new C(); // C�� B�̴�.(O)
		B b4 = new D(); // D�� B�̴�.(O)
		
		// C Ÿ���� �پ��� ǥ��
//		C c1 = new A(); // A�� C�̴�.(X)
//		C c2 = new B(); // B�� C�̴�.(X)
		C c3 = new C(); // C�� C�̴�.(O)
//		C c4 = new D(); // D�� C�̴�.(X)
		
		// D Ÿ���� �پ��� ǥ��
//		D d1 = new A(); // A�� D�̴�.(X)
//		D d2 = new B(); // B�� D�̴�.(X)
//		D d3 = new C(); // C�� D�̴�.(X)
		D d4 = new D(); // D�� D�̴�.(O)		
	}
}
