package codeforces;

import java.io.*;
public class Dominos {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String[] s=br.readLine().split(" ");
          int n=Integer.parseInt(s[0]);
          int m=Integer.parseInt(s[1]);
          if(m<=16 && n<=16) {
        	 int count= m*n/2;
        	 System.out.println(count);
          }
	}

}
