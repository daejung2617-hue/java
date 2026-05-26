package jump_to_java;
import java.util.Scanner;
import java.util.Random;
public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int answer = rand.nextInt(90)+10;
		int user;
		int count =0;
		
		while(true) {
			System.out.print("2자리 자연수 입력: ");
			user = sc.nextInt();
			count ++;
			if (user<10 || user>99){
				System.out.print("다시 입력!!");
			}
			else if(user>answer) {
				System.out.print("정답은 더 작은수");
			}
			else if(user<answer) {
				System.out.print("정답은 더 큰수");
			}
			else {
				System.out.print("정답!!");
				System.out.println("시도횟수: "+ count);
				break;
			}
		}
		sc.close();
	}
}
