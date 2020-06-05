package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		char[] c=s.toCharArray();
		int uc=0,lc=0;
		for(int i=0;i<c.length;i++) {
			if(Character.isUpperCase(c[i])) {
				uc++; }
			else
			{  lc++; }
		}
		if(lc>=uc) {
			s=s.toLowerCase();
		}
		else { s=s.toUpperCase(); }
            System.out.print(s);
	}

}
