package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class IgnoreOrChat {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine(); 
		HashSet<Character> h=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			h.add(ch);
		}
		if (h.size() % 2 == 0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
	}

}
