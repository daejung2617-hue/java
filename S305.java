package jump2java;

public class S305 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		String result = sb.toString();
		System.out.println(result);
		
		String result2 = "";
		result2 += "hello";
		result2 += " ";
		result2 += "jump to java";
		System.out.println(result2);
		
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("hello");
		sb2.append("jump to java");
		String result3 = sb2.toString();
		System.out.println(result3);
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("jump to java");
		sb3.insert(0,"hello");
		System.out.println(sb3.toString());
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append("Hello jump to java");
		sb4.delete(6,11);
		System.out.println(sb4.toString());
		
		StringBuffer sb5 = new StringBuffer();
		sb5.append("Hello jump to java");
		System.out.println(sb5.substring(0,4));
	}
}
