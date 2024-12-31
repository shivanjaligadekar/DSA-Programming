package dsaprogramming;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10;
		System.out.println("before swapping...");
		System.out.println("a:"+a+",b:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping...");
		System.out.println("a:"+a+",b:"+b);
	}

}
