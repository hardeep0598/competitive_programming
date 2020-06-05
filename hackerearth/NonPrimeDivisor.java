package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NonPrimeDivisor {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		System.out.print(find(n));
	}
	public static int find(int n) {
		if(n==0) return 2;
		if(n==1) return 1;
		if(n==2 || n==3) return 0;
		int count=0; boolean found=false;
		while(!found) {
			if(prime(n)) { found=true; }
			else {
			n=n++;
			count++; }
		}
		return count;
	}
	private static boolean prime(int n) {
		/ Base cases 
	    if (n <= 1) 
	        return false; 
	    if (n <= 3) 
	        return true; 
	   
	    // This is checked so that we can skip 
	    // middle five numbers in below loop 
	    if (n % 2 == 0 || n % 3 == 0) 
	        return false; 
	   
	    // For all the remaining numbers, check if 
	    // any number is a factor if the number 
	    // or not 
	    for (int i = 5; i * i <= n; i = i + 6) 
	        if (n % i == 0 || n % (i + 2) == 0) 
	            return false; 
	   
	    // If none of the above numbers are the 
	    // factors for the number, then the 
	    // given number is prime 
	    return true; 
	}
}
