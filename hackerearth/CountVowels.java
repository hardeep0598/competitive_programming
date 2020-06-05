package hackerearth;

import java.io.*;

class CountVowels{
     public static void main(String args[] ) throws Exception
     {
    	 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
    String s=br.readLine();
    count(s);
        }
     }
     public static void count(String a)
     {
    	 long x=0,sum=0;
        int n=a.length();
        for(int i=0;i<n;i++)
        {
        	char ch=a.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        { x=(n-i)*(i+1);
         sum=sum+x;
        }
        else
        continue; }
        
        System.out.println(sum);
    }
}



