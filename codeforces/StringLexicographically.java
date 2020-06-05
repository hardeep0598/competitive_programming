package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringLexicographically {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		String s2=br.readLine();
			System.out.print(s1.compareTo(s2));
	}
}
