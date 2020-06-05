package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LuckyNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        char[] c=s.toCharArray();
        if(find(c)) {
        	System.out.print("YES"); }
        	else
        		{ System.out.print("NO"); }
        }

	public static boolean find(char[] c) {
		int count=0;
		if(c.length==1) { return false; }
		for(int i=0;i<c.length;i++) {
        	if(c[i]=='7' || c[i]=='4') {
        		count++;
        	}
        }
		if(count==4 || count==7) 
			return true;
		return false;
	}

}
