package jump2java;

public class S304 {
	public static void main(String[] ages){
		String a ="a:b:c:d";
		String[] result = a.split(":");
		
		System.out.println(String.format("I eat %d apples.", 3));
		
		System.out.println(String.format("I eat %s apples.", "five"));
		
		int number=3;
		System.out.println(String.format("I eat %d apples", number));
		
		number = 10;
		String day = "three";
		System.out.println(String.format("I ate %d apples. so I aws sick for %s days",number,day));
		System.out.println(String.format("I have %s apples",3));
		System.out.println(String.format("rate is %s ",3.234));
		System.out.println(String.format("Error is %d%%.", 98));
		System.out.println(String.format("%10s","hi"));
		System.out.println(String.format("%.4f", 3.42134234));
		System.out.println(String.format("%10.4f", 3.42134234));
		System.out.println(String.format("I eat %d apples.", 3));
		System.out.printf("I eat %d apples",3);
	}
}
