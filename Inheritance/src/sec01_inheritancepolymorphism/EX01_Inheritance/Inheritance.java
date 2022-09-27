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
		// Human 按眉 积己
		Human h = new Human();
		h.name = "辫泅瘤";
		h.age = 11;
		h.eat();
		h.sleep();
		
		// Student 按眉 积己
		Student s = new Student();
		s.name = "辫刮己";
		s.age = 16;
		s.studentID = 128; // @override茄 干滚
		s.eat();
		s.sleep();
		s.goToSchool(); // @override茄 干滚(皋家靛)
		
		// Worker 按眉 积己
		Worker w = new Worker();
		w.name = "豪辣沥";
		w.age = 45;
		w.workerID = 128; //@override茄 干滚
		w.eat();
		w.sleep();
		w.goToWork(); //@override茄 干滚(皋家靛)
	}
}
