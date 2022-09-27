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
		// Human °´Ã¼ »ý¼º
		Human h = new Human();
		h.name = "±èÇöÁö";
		h.age = 11;
		h.eat();
		h.sleep();
		
		// Student °´Ã¼ »ý¼º
		Student s = new Student();
		s.name = "±è¹Î¼º";
		s.age = 16;
		s.studentID = 128; // »õ·Î Ãß°¡ÇÑ ¸É¹ö
		s.eat();
		s.sleep();
		s.goToSchool(); //»õ·Î Ãß°¡ÇÑ ¸É¹ö(¸Þ¼Òµå)
		
		// Worker °´Ã¼ »ý¼º
		Worker w = new Worker();
		w.name = "ºÀÀ±Á¤";
		w.age = 45;
		w.workerID = 128; //»õ·Î Ãß°¡ÇÑ ¸É¹ö ¸É¹ö
		w.eat();
		w.sleep();
		w.goToWork(); //»õ·Î Ãß°¡ÇÑ ¸É¹ö(¸Þ¼Òµå)
	}
}
