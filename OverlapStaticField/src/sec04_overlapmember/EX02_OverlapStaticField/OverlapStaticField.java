package sec04_overlapmember.EX02_OverlapStaticField;

class A {
	static int m = 3;
}
class B extends A {
	static int m = 4;
}
public class OverlapStaticField {
	public static void main(String[] args) {
		// Ŭ���������� �ٷ� ����
		System.out.println(A.m);
		System.out.println(B.m);
		System.out.println();
		
		// ��ü ����
		A aa = new A();
		B bb = new B();
		A ab = new B(); // Ÿ�� A�� ���� �������� ab�� B�����ڸ� ���� ���������.
		
		// ������ ��ü�� ���� �ʵ� ȣ��
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m); 
	}
}
