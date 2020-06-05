package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dollars {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int k=Integer.parseInt(s[0]);
		long n=Long.parseLong(s[1]);
		int w=Integer.parseInt(s[2]);
		int i,sum=0;
		for(i=1; i<=w; i++){
			sum = sum+(i*k);
		}
		if(sum<= n){
		System.out.print("0");}
		else {
			System.out.print(sum-n);
		}
	}

}
