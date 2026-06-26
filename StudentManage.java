package jumptojava;
class Student{
	String name;
	int grade;
	Student(String n,int g){
		name=n;
		grade=g;
	}
	void Study() {
		System.out.println(name + " 공부한다.");
	}
	void Study(int hour) {
		System.out.println(hour+"시간 공부한다.");
	}
}
class Leader extends Student{
	int members;
	Leader(String n,int g,int m){
		super(n,g);
		members = m;
	}
	void Study(){
		System.out.println(name+"가 조장을 맡아 공부를 이끈다.");
	}
	void manage() {
		System.out.println(members +  "명의 조원을 관리한다.");
	}
}
public class StudentManage {
	public static void main(String[] args) {
		Student st = new Student("스마트",1);
		Leader leader = new Leader("스마엉",2,21);
		st.Study();
		st.Study(5);
		leader.Study();
		leader.Study(3);
		leader.manage();
	}
}
