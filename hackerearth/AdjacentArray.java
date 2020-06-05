package hackerearth;
import java.util.*;

public class AdjacentArray {

	 public static void main(String args[] ) throws Exception {
	        Scanner s = new Scanner(System.in);
	        int n=s.nextInt();
	        int[] a=new int[n];
	        a[0]=1;
	        int sum=a[0];
	        for(int i=0;i<n;i++){
	        	sum=0;
	        	for(int j=i;j<n;j++) {
	        		sum=sum+a[j];
	   
	        	}
	        }
	        Collections.sort(ar);
	        for(int i=0;i<n;i++) {
	        	System.out.print(ar.get(i)+" ");
	        }
	    }
	}
