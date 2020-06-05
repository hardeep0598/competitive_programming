package codeforces;

import java.util.Scanner;

public class Hulk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ddd(n);

	}
	public static void ddd(int n) {
		int i=0;
		if(n==1) { System.out.print("I hate it"); return; }
        while(i<n) {
        	//if(i!=1) {System.out.print("that "); }
			System.out.print("I hate ");
			System.out.print("that ");
			System.out.print("I love ");
			if(i==n-1) { System.out.print("it");  return;}
   		}
	}

}
