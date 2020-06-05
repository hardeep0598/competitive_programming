package maths;
// brute force approach
public class modInverse {

	public static void main(String[] args) {
		int a=57847,m=11;
		System.out.println(find(a,m));
	}

	private static int find(int a, int m) {
		a=a%m;
		for(int i=1;i<m;i++) {
			if((a*i)%m==1)
				return i;
		}
		return 1;
	}
//time complexity : O(m)
//2nd methods works when a and m are co-prime

private static void find1(int a, int m) {
	int x, y;
	int gcd=(a,m,x,y);
	if (g != 1) {
		System.out.print("Inverse doesnt exist");
	}
	else
    { 
        // m is added to handle negative x 
        int res = (x%m + m) % m; 
        System.out.println("Modular multiplicative inverse is "+ res); 
    }	
}
}