package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine(); int a=0,d=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='A') {
				a++;
			}
			else { d++; }
		}
		if(a==d) { System.out.print("Friendship"); }
		if(a>d) {System.out.print("Anton"); }
		if(a<d) {System.out.print("Danik"); }

	}

}
