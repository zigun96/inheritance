package sec03_methodoverriding.EX03_MethodOverriding_3;

class A {
	void print1() {
		System.out.println("A Ŭ���� print1");
	}
	void print2() {
		System.out.println("A Ŭ���� print2");
	}
}
class B extends A {
	@Override
	void print1() {
		System.out.println("BŬ���� print1");
	}
	void print2(int a) {
		System.out.println("BŬ���� print2");
	}
}
public class MethodOverriding_3 {
	public static void main(String[] args) {
		// A Ÿ�� ���� / A ������ ���
		A aa = new A();
		aa.print1();
		aa.print2();
		System.out.println();
		
		// B Ÿ�� ���� / B ������ ���
		B bb = new B();
		bb.print1();
		bb.print2();
		bb.print2(3);
		System.out.println();
		
		// A Ÿ�� ���� / B ������ ���
		A ab = new B();
		ab.print1();
		ab.print2();
	}
}
