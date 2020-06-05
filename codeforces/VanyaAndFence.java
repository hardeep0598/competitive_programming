package codeforces;

import java.util.Scanner;

public class VanyaAndFence {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		int mean=0,a;
		for(int i=0;i<n;i++) {
			a=sc.nextInt();
			if(a>h) { mean++; }
			mean++;
		}
        System.out.print(mean);
	}

}
