package dsaprogramming;

public class SecondLargest {
	public static int findSecondLargest(int[]A, int N) {
		if(N < 2) {
			System.out.println("Array contain at least 2 ele:");
			return -1;
		}
		int largest=Integer.MIN_VALUE;
		int secondLargest1=Integer.MAX_VALUE;
		
		for(int i=0;i<N; i++) {
			if(A[i] >largest) {
				secondLargest1=largest;
				largest=A[i];
			}else if(A[i] > secondLargest1 && A[i] !=largest) {
				secondLargest1=A[i];
			}
		}
		if(secondLargest1 == Integer.MIN_VALUE) {
			System.out.println("No seconf largest ele:");
			return -1;
		}
		return secondLargest1;
	}

	public static void main(String[] args) {
		int[] A= {7,3,9,2,8};
		int N=A.length;
		int secondLargest1=findSecondLargest(A, N);
		
		if(secondLargest1 !=-1) {
			System.out.println("Second Largest:"+secondLargest1);
		}

	}

}
