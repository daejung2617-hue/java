package jump_to_java;
import java.util.Scanner;
class Student{
	String name;
	int age;
	int score;
	Student(String name){
		this.name = name;
		
	}
	Student(String name, int age){
		this.name = name;
		this.age = age;
		this.score = 100;
	}
	
	void info() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}

public class S0602A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		sc.close();
		Student s1 = new Student(name);
		s1.info();
		
		Student s2 = new Student(name,18);
		s2.info();
	}

}
