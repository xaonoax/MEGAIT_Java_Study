package day07;

public class Ex32_Generic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Worker w = new Worker();
		Student s = new Student();
		HighStudent h = new HighStudent();
		
		Applicant<Student> as = new Applicant(s);
		Applicant<HighStudent> ah = new Applicant(h);
		Applicant<Worker> aw = new Applicant(w);
		Applicant<Person> ap = new Applicant(p);
		
		Course c = new Course();
		c.registerOpen(as);
		c.registerOpen(ah);
		c.registerOpen(aw);
		c.registerOpen(ap);
		
		c.registerStudent(as);
		c.registerStudent(ah);
//		c.registerStudent(aw);
//		c.registerStudent(ap);
		
//		c.registerWorker(as);
//		c.registerWorker(ah);
		c.registerWorker(aw);
		c.registerWorker(ap);
	}

}

class Person { }
class Worker extends Person{ }
class Student extends Person { }
class HighStudent extends Student { }

class Applicant<T> {
	public T kind;
	
	Applicant(T kind) {
		this.kind = kind;
	}
}

class Course {
	public void registerOpen(Applicant<?> ap) {  // 함수에 거는 방법
		System.out.println("[누구나]" + ap.kind.getClass().getSimpleName() + "등록 완료.");		
	}
	
	// Student, HightStudent
	public void registerStudent(Applicant<? extends Student> ap) { 
		System.out.println("[학생]" + ap.kind.getClass().getSimpleName() + "등록 완료.");
	}
	
	// Person, Worker
	public void registerWorker(Applicant<? super Worker> ap) { 
		System.out.println("[직장인]" + ap.kind.getClass().getSimpleName() + "등록 완료.");
	}
}