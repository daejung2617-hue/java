package jump_to_java;
import java.util.Scanner;
public class Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월입력:");
		int month;
		while(true) {
			month = sc.nextInt();
			if(1<=month && month <=12) {
				sc.close();
				break;
			}
			else {
				System.out.println("다시 입력");
			}
			
		}
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄이다.");
		}
		else {
			System.out.println("봄이 아니다.");
		}
		if (month >= 3 && month<=5) {
			System.out.println("봄이다.");
		}
		else {
			System.out.println("봄이 아니다.");

		}
		
	switch(month) {
	case 3:
	case 4:
	case 5:
		System.out.println("봄이다.");
		break;
	default:
		System.out.println("봄이 아니다.");
	}
	

	}
	
}
