package maths;
import java.math.*;
public class prime
{
	static boolean isPrime(int n) 
    { 
        if (n <= 1) return false;  
        if (n%2==0) return false;
        for (int i = 3; i <= Math.sqrt(n); i++) 
            if (n % i == 0) 
                return false; 
      
        return true; 
    } 
	public static void main(String[] args) {
		int n=15;
		System.out.print(isPrime(n));
	}
}
//time complexity :O(n)
