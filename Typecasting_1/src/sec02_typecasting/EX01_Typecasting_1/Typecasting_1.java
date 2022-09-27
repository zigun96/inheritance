package sec02_typecasting.EX01_Typecasting_1;

// 클래스의 상속 관계
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Typecasting_1 { // !상속시 업캐스팅은 비교적 자유로우나 다운캐스팅은 부모가 자식의 내용을 갖지 않는 이상 불가능하다.!
	public static void main(String[] args) {
		// 업 캐스팅(자동 변환): 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
		A ac = (A) new C(); // C -> A 업캐스팅(자동 변환), C 생성자를 포함하는 A객체 ac 생성
		B bc = (B) new C(); // C -> B 업캐스팅(자동 변환), C 생성자를 포함하는 B객체 bc 생성
		
		B bb = new B();
		A a = (A) bb; // B -> A 업캐스팅(자동 변환)
		
		// 다운캐스팅(수동 변환): 캐스팅할 수 없을 때(실행할 때 예외 발생)
		A aa = new A();
//		B b = (B) aa; // A -> B 다운캐스팅(수동 변환): 불가능
//		C c = (C) aa; // A -> C 다운캐스팅(수동 변환): 불가능
		
		// 다운캐스팅(수동 변환): 캐스팅이 가능할 때
		A ab = new B();
		B b = (B) ab; // A -> b 다운캐스팅(수동 변환)
//		C c = (C) ab; // A -> C 다운캐스팅(수동 변환): 불가능
		
		B bd = new D();
		D d = (D) bd; // B -> D 다운캐스팅(수동 변환)
		
		A ad = new D();
		B b1 = (B) ad; // A -> B 다운캐스팅(수동 변환)
		D d1 = (D) ad; // B -> D 다운캐스팅(수동 변환)
	}
}
