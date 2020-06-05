package hackerearth;

import java.io.*;

public class LockDownGame {
	
    public static void main(String args[] ) throws Exception {
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n=Integer.parseInt(br.readLine());
     String s=br.readLine();
     int[] a=new int[n];
     int i=0,p=0,len=s.length();
        for(i=0;i<n;i++) {
        	char ch=s.charAt(p);
        	if(ch=='x' && a[i]!=0)
        		{ a[i]=1; 
        		p++; i++; }
        	else if(ch=='y' && a[i]!=0)
        	{ a[i]=0; i++;  p++;}
        	if(len>p+1) {p=0;}
        	if(n>i+1) {i=0;}
        }
          for(int u=0;u<n;u++)
          {  if(a[u]==1)
                System.out.print(u);}
    }
}