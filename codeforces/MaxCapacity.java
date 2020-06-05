package codeforces;

import java.util.Scanner;

public class MaxCapacity {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n,max,enter,exit,tram;
		while(sc.hasNextInt()) {
			n=sc.nextInt();
			max=0;tram=0;
			for(int i=0;i<n;i++) {
				exit=sc.nextInt();
				enter=sc.nextInt();
				tram=tram-exit;
				tram=tram-enter;
				if(tram>max)
				{ max=tram; }
			}
			System.out.print(max);
		}
	}
}