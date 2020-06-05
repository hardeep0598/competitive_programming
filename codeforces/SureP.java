package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SureP {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int count=0,count2=0;
		String s;
		for(int i=0;i<n;i++)
		{
			count=0;
			s=br.readLine();
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='1')
					count++;
			}
			if(count>=2)
			{
				count2++;
			}
		}
				System.out.print(count2);
	}
}
