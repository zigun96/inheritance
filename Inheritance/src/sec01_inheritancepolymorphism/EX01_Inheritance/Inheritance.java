package sec01_inheritancepolymorphism.EX01_Inheritance;

class Human {
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human {
	int studentID;
	void goToSchool() {}
}

class Worker extends Human {
	int workerID;
	void goToWork() {}
}

public class Inheritance {
	public static void main(String[] args) {
		// Human ��ü ����
		Human h = new Human();
		h.name = "������";
		h.age = 11;
		h.eat();
		h.sleep();
		
		// Student ��ü ����
		Student s = new Student();
		s.name = "��μ�";
		s.age = 16;
		s.studentID = 128; // ���� �߰��� �ɹ�
		s.eat();
		s.sleep();
		s.goToSchool(); //���� �߰��� �ɹ�(�޼ҵ�)
		
		// Worker ��ü ����
		Worker w = new Worker();
		w.name = "������";
		w.age = 45;
		w.workerID = 128; //���� �߰��� �ɹ� �ɹ�
		w.eat();
		w.sleep();
		w.goToWork(); //���� �߰��� �ɹ�(�޼ҵ�)
	}
}
