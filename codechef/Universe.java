package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Universe
{
	public static void main (String[] args) throws Exception
	{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());
			while(t-->0) {
					String[] s=br.readLine().split(" ");
					long i=Long.parseLong(s[0]);
					long n=Long.parseLong(s[1]);
					long q=Long.parseLong(s[2]);
					if(find(i,n,q))
					System.out.println("YES");
					else
						System.out.println("NO");
			}
	}
	static boolean find(long i,long n,long q) 
	{ 
		String res=n+""+q;
		long sum=0,temp=n+q,tempsum=0;
		long p=i-2;
		while(p-->0) {
			sum=(temp)%10;
			res=res+""+sum;
			temp=(temp+sum)%10;
		}
		for(int y=0;y<res.length();y++) {
			int t=(int) (res.charAt(y));
			tempsum=tempsum+t;
		}
		if(tempsum%3==0) {
			return true;
		}
		return false;
	}
}
