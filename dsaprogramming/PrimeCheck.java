package dsaprogramming;

import java.util.Scanner;

public class PrimeCheck {

//	public static void main(String[] args) {
//		int num=11;
//		boolean isPrime=true;
//		for(int i=2;i<=Math.sqrt(num);i++) {
//			if(num%i==0) {
//				isPrime=false;
//				break;
//			}
//		}
//		System.out.println(isPrime);
//	}
//
//}
	
	static String isPrime(int n) {
		if(n<2)
			return "Not Prime";
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return "Not Prime";
			}
		}
		return "Prime";
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		System.out.println(isPrime(number));
		sc.close();
	}
}
