package sec05_superkeywordsupermethod.EX01_SuperKeyword_1;

class A {
	void abc() {
		System.out.println("A Ŭ������ abc()");
	}
}
class B extends A {
	void abc() {
		System.out.println("B Ŭ������ abc()");
	}
	void bcd() {
		abc(); // this.abc();
	}
}
public class SuperKeyword_1 {
	public static void main(String[] args) {
		// ��ü ����
		B bb = new B ();
		
		// �޼��� ȣ��
		bb.bcd();
	}
}
