package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BittOperation {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           int n=Integer.parseInt(br.readLine());
           int x=0;
           String s;
           while(n-->0 && n<=150) {
        	   s=br.readLine();
        	   if(s.charAt(0)=='+' || s.charAt(1)=='+') {
        		   x=x+1;
        	   }
        	   else {
        		   x=x-1;
        	   }
           }
           System.out.println(x);
	}

}
