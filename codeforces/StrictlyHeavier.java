package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrictlyHeavier {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int l=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		System.out.print(year(l,b));
	}
	
	public static int year(int l,int b) {
		int year=0;
	if(l==b) { return 1; }
	while(l<=b) {
		l=l*3;
		b=b*2;
		year++;
	}
        return year;
	}
}
