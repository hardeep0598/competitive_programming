package codeforces;

import java.util.Scanner;

public class GreaterScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        int count=0;
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        while(n>=k && n<=50 && k<=50) {
        for(int i=0;i<n;i++) {
        	if(a[i]>=a[k] && a[i]>0) {
				count++;
        	}
        }
        System.out.print(count);
	}
	}
}
