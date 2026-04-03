package jump2java;

public class S306 {
	public static void main(String[] args) {
		int[] odds = {1,3,5,7,9};
		String[] weeks = {"월","화","목","금","토","일"};
		String[] weeks1 = new String[7];
		weeks1[0]="월";
		weeks1[1]="화";
		weeks1[2] = "수";
		weeks1[3] = "목";
		weeks1[4] = "금";
		weeks1[5] = "토";
		weeks1[6] = "일";
		
		String[] weeks2 = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks2[3]);
		
		String[] weeks3 = {"월", "화", "수", "목", "금", "토", "일"};
		for (int i = 0; i < weeks3.length; i++) {
		    System.out.println(weeks3[i]);
		}
		
	}
}
