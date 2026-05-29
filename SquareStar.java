package jump_to_java;
import java.util.Scanner;
public class SquareStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=0; i<num; i++) {
			for(int j =0; j<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i =1; i<=num; i++) {
			for(int j =0; j<i;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i =1; i<=num; i++) {
			for(int j=num; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i =1; i<=num; i++) {
			for(int j=i; j<num;j++) {
				System.out.print(" ");
			}
			for (int n=1; n<=i; n++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
