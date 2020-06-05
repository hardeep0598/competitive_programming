package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueueAtSchool {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s[]=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		String str=br.readLine();
		int i=0,count=0;
		StringBuilder sb=new StringBuilder(str);
		while(k-->0) {
			if( str.charAt(i)=='B' && str.charAt(i+1)=='G') {
				sb.setCharAt(i+1,'G');
				}
				sb.setCharAt(i,'B');
		    }
			i++;
		}
		System.out.print(sb.toString());
	}

