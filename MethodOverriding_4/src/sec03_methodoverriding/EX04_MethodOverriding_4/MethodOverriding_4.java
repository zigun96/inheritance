package sec03_methodoverriding.EX04_MethodOverriding_4;

class A {
	protected void abc() {}
}
class B1 extends A {
	public void abc() {}
}
class B2 extends A {
	protected void abc() {}
}
class B3 extends A {
	// void abc() [} // default ���� ������ (�������� �Ұ���)
}
class B4 extends A {
	// private void abc() {} // private ���� ������ (�������� �Ұ���)
}
public class MethodOverriding_4 {
	public static void main(String[] args) {
	}
}
