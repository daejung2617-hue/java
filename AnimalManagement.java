package jumptojava;

class Animal{
	String name;
	int age;
	
	Animal(String n,int a){
		name=n;
		age=a;
	}
	void sound() {
		System.out.println(name+"가 운다.");
	}
	void sound(int count) {
		System.out.println(count +"번 운다.");
	}
}
class Dog extends Animal{
	int speed;
	Dog(String n,int a,int s){
		super(n,a);
		speed = s;
	}
	void sound() {
		System.out.println(name + "멍멍!");
	}
	void run(int time) {
		System.out.println((speed*time)+"m 달림");
	}
}
public class AnimalManagement {
	public static void main(String[] args) {
		Dog dog =new Dog("smart",10,10);
		dog.sound();
		dog.sound(3);
		dog.run(5);	
	}
}
