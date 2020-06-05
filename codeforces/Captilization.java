package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Captilization {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringBuilder sb = new StringBuilder(s); 
        char ch=s.charAt(0);
        if(ch>=97 && ch<=122) {
        	sb.setCharAt(0, Character.toUpperCase(ch));   
        	}
        System.out.print(sb.toString());
	}

}
