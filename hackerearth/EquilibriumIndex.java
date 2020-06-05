package hackerearth;

public class EquilibriumIndex {

	public static void main(String[] args) {
		int[] a= {-7,1,5,2,-4,3,0};
		int n=a.length;
		int e=Eindex(a,n);
		System.out.print(e);
	}

	private static int Eindex(int[] a, int n) {
		int sum=0,leftsum=0;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		for(int i=0;i<n;i++)
		{
			sum=sum-a[i];
			if(sum==leftsum)
				return i;
			leftsum=leftsum+a[i];
		}
		return -1;
	}
}
