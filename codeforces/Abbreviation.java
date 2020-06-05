package codeforces;

import java.io.*;

public class Abbreviation {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s;
		while(n-->0) {
			s=br.readLine();
			int p=s.length();
			if(p>10) {
				char c=s.charAt(0);
				char c2=s.charAt(p-1);
				System.out.println(c+""+(p-2)+""+c2);
			}
			else {
				System.out.println(s);
			}
		}
	}
}
