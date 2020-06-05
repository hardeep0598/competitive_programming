package codeforces;

import java.util.Scanner;
public class Magnet {

	public static void main(String[] args)  {
		Scanner br=new Scanner(System.in);
		int n=br.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=br.nextInt();
		}
		int group=1;
		for(int i=0;i<n-1;i++){
		    if(a[i]!=a[i+1])
		        group++;
		}
		System.out.print(group);

	}

}
