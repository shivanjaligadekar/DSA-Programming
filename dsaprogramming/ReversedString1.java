package dsaprogramming;

public class ReversedString1 {

	public static void main(String[] args) {
		String str="shivanjali";
		String reversedStr=reversedStr(str);
		System.out.println("Orignal string"+str);
		System.out.println("reverse string"+reversedStr);
	}
	
	public static String reversedStr(String s) {
		String reversed="shivanjali";
		int length=s.length();
		int i=length-1;
		
		while(i>=0) {
			if(i>=0) {
				reversed += s.charAt(i);
			}
		}
		return reversed;
	}

}
