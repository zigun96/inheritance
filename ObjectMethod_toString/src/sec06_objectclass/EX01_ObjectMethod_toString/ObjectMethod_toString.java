package sec06_objectclass.EX01_ObjectMethod_toString;

class A {	//extends Object(�����Ϸ��� ���� �ڵ����� �߰�)
	int a = 3;
	int b = 4;
}
class B {
	int a = 3;
	int b = 4;
	
	public String toString() {
		return "�ʵ尪(a, b) = " + a + " " + b;
	}
}
public class ObjectMethod_toString {
	public static void main(String[] args) {
		// ��ü ����
		A a = new A ();
		B b = new B ();
		
		// �޼��� ȣ��
		System.out.printf("%x\n", a.hashCode());
		System.out.println(a.toString());
		System.out.println(b);
	}
}
