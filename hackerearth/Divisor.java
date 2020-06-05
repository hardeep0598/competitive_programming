package hackerearth;

import java.util.*;
 class Divisor
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
            long n=sc.nextLong();
            long k=sc.nextLong();
            long sum1=(n*(n+1))/2;
            long sum=0,temp=0;
            for(long i=k;i<=n;i=i+k){
                 temp=i;
                while(temp%k==0){
                    temp=temp/k;
                }
                sum=sum+(i-temp);
            }
        System.out.println(sum1-sum);
        sc.close();
    }
   
}