package dsaprogramming;

public class FindMinMax {
	public static int[] MinMax(int[] A,int N) {
		int[] result=new int[2];
		int min=A[0];
		int max=A[0];
		
		for(int i=0;i<N;i++) {
			if(A[i] < min) {
				min=A[i];
			}
			if(A[i]>max) {
				max=A[i];
			}
		}
		result[0]=min;
		result[1]=max;
		return result;
	}

	public static void main(String[] args) {
		int[] A= {5,3,9,2,8};
		int N=A.length;
		int[] minmax=MinMax(A,N);
		
		System.out.println("Minimum:"+minmax[0]);
		System.out.println("Maximum:"+minmax[1]);
	}

}
