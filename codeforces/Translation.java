package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Translation {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String t=br.readLine();
		s=new StringBuilder(s).reverse().toString();
		if(s.equals(t)) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}
}
