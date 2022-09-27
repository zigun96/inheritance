package sec05_superkeywordsupermethod.EX03_SuperMethod_1;

class A {
	A() {
		System.out.println("A 생성자");
	}
}
class B extends A {
	B() {
		super();
		System.out.println("B 생성자");
	}
}
class C {
	C(int a) {
		System.out.println("C 생성자");
	}
}
class D extends C {
	/* 컴파일러가 자동으로 추가해주는 내용
	 * D() {
	 * 		super(); // C의 생성자는 a라는 매개변수를 받는 생성자이므로 기본으로 생성해주는 생성자를 넣을 경우 오류가 생긴다.
	 * }
	 */
	D() {
		super(3);
	}
}
public class SuperMethod_1 {
	public static void main(String[] args) {
		// A 객체 생성
		A aa = new A();
		System.out.println();
		
		// B 객체 생성
		B bb = new B();
	}
}
