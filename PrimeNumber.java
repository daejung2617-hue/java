package jump_to_java;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2이상 입력:");
		int num;
		boolean isPrime = true;
		while(true) {
			num = sc.nextInt();
			if (num>=2) {
				sc.close();
				break;
			}
			System.out.print("2이상 입력하세요.");
			
		}
		for(int i = 2; i<num; i++) {
			if (num % i ==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num + "은(는) 소수이다.");
		}
		else {
			System.out.println(num + "은(는) 소수가 아니다.");
		}
	}
}
