package sec06_objectclass.EX03_ObjectMethod_hashcode;

import java.util.HashMap;

class A {
	String name;
	A(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		} else
			return false;
	}
	@Override
	public String toString() {
		return name;
	}
}
class B {
	String name;
	B(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
		} else
			return false;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public String toString() {
		return name;
	}
}
public class ObjectMethod_hashcode {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1,  "������1");
		hm1.put(1,  "������2");
		hm1.put(2,  "������3");
		System.out.println(hm1);
		
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("ù ��°"), "������1");
		hm2.put(new A("ù ��°"), "������2");
		hm2.put(new A("�� ��°"), "������3");
		System.out.println(hm2);
		
		HashMap<A, String> hm3 = new HashMap<>();
		hm3.put(new A("ù ��°"), "������1");
		hm3.put(new A("ù ��°"), "������2");
		hm3.put(new A("�� ��°"), "������3");
		System.out.println(hm3);
	}
}
