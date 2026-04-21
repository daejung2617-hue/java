package jumptpjava;

public class S311 {
	 public static void main(String[] args) {
		 String num = "123";
	     int n = Integer.parseInt(num);
	     System.out.println(n);
	     
	     int n1 = 123;
	     String num1 =""+n1;
	     System.out.println(num1);
	     
	     String num2 = String.valueOf(n1);
	     String num3 = Integer.toString(n1);
	     System.out.println(num2);
	     System.out.println(num3);
	     
	     String num4 = "123.456";
	     double d = Double.parseDouble(num4);
	     System.out.println(d);
	     
	     double d1 = n1;
	     System.out.println(d1);
	     
	     double d2 = 123.456;
	     int n2 = (int) d2; 
	     System.out.println(n2); 
	     
	     String num5 = "123.456";
	     int n3 = Integer.parseInt(num5);
	     
	     final int n4 = 123;
	     
	     
	 }
}
