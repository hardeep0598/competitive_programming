package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargerYear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int year=Integer.parseInt(br.readLine());
		while(true) {
			year=year+1;
			int a=year/1000;
			int b=year/100%10;
			int c=year/10%10;
			int d=year%10;
			if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) 
				break;			
		}
		System.out.print(year);
	}

}
