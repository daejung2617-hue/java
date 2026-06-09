package jump2java;
import java.util.Scanner;
class Book{
	String title;
	String author;
	int year;
	boolean borrow;
	Book(String title, String author, int year){
		this.title = title;
		this.author =author;
		this.year = year;
		borrow = false;
	}
	void show() {
		System.out.println("제목 : " + title);
	}
	String borrowof() {
		if (borrow) {
			return "대출 블가";
		}
		else {
			borrow = true;
			return "대출가능";
		}
	}
}
public class S0609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("책 제목 : ");
		String title = sc.next();
		System.out.print("저자 : ");
		String author = sc.next();
		System.out.print("발행 년도 :");
		int year = sc.nextInt();
		Book b1 = new Book (title,author,year);
		b1.show();
		System.out.println("대출 상태 :"+ b1.borrowof());
	}
}
