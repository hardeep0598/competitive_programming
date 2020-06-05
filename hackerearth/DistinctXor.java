package hackerearth;

import java.util.*;

public class DistinctXor {

    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        HashSet<Long> h=new HashSet<Long>();
        h.add(a);
        h.add(b);
        long ans=0;
        for (int i = 0; i < 60; i++) { 
            int k1 = 0; 
            int k0 = 0;  
            for (long j = a; j <= b; j++) {  
                if ((j & (1 << i)) != 0) 
                    k1++; 
                else
                    k0++; 
            } 
           
            ans = ans + (1 << i) * (k1 * (k1 - 1) / 2) + (1 << i) * (k1 * k0); 
            h.add(ans);
        } 
        System.out.print(h.size());
    }
}
