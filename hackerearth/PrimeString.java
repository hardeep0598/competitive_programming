package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PrimeString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
        int t=Integer.parseInt(br.readLine());
        while(t-->0) {
        	s=br.readLine();
        	if(find(s)) {
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
        }
	}
	public static boolean isPrime(int n) {
		if(n==1 || n==0) return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean find(String s) {
		int n=s.length(),count1=0;
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			if(h.containsKey(ch)) {
			     h.put(ch,h.get(ch)+1);
			}
			else {
				h.put(ch,1);
			}
		}
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			if(!isPrime(h.get(ch)))
				{return false;}
			else
				{continue;}
		}
		int n1=h.size();
		if(!isPrime(n1))
			return false;
		return true;			
	}

}
