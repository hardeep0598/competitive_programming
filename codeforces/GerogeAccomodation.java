package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GerogeAccomodation {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s[]; int count=0;
		while(n-->0) {
			s=br.readLine().split(" ");
			int p=Integer.parseInt(s[0]);
			int q=Integer.parseInt(s[1]);
			if(q-p>=2) {
				count++;
			}
		}
		System.out.print(count);
	}
}
