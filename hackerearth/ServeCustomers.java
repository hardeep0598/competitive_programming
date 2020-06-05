package hackerearth;

import java.util.Scanner;
import java.math.*;

public class ServeCustomers {

	public static void find(int []a,int[] b,int n,int k){
		int i=0;
        int[] wt=new int[k];
        int[] q=new int[n];
        for(i=0;i<k;i++){
          q[i]=a[i];
          wt[i]=a[i]+b[i];
        }
        for(;i<n;i++){
          int index=findminwt(wt,k);
          q[i]=Math.max(wt[index],a[i]);
          wt[index]=q[i]+b[i];
        }
       for(int p=0;p<n;p++){
         System.out.print(q[p]+" ");
       }  
}
	public static int findminwt(int[] wt,int k){
	       int index = 0,min=wt[0];
	    for (int i=1; i<k; i++){
	        if (wt[i] < min ){
	            min=wt[i];
	            index=i;
	        }
	    }
	     return index ;
	  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int k=sc.nextInt();
	      int[] a=new int[n];
	      int[] b=new int[n];
	      int[] c=new int[n];
	      for(int i=0;i<n;i++){
	         a[i]=sc.nextInt();
	      }
	       for(int i=0;i<n;i++){
	         b[i]=sc.nextInt();
	      }
	       for(int i=0;i<n;i++){
	         c[i]=sc.nextInt();
	      }
	      find(a,b,n,k);
	      sc.close();
	}


}
