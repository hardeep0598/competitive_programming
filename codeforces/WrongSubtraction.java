package codeforces;

import java.io.*;

public class WrongSubtraction {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		while(k-->0) {
			int lastdig=n%10;
			if(lastdig!=0) {
				n=n-1;
			}
			else 
				if(lastdig==0) {
					n=n/10;
				}
		}
		System.out.print(n);

	}

}
