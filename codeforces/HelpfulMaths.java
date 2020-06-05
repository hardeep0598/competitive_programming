package codeforces;

import java.io.*;
import java.util.Arrays;

public class HelpfulMaths {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           String s=br.readLine().replace("+","");
           char[] c=s.toCharArray();
           Arrays.sort(c);
           int i;
           for(i=0;i<c.length-1;i++){
               System.out.print(c[i]+"+"); }
               if(i == c.length-1)
                
               System.out.print(c[c.length-1]);          
           
	}

}
