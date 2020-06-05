import java.io.*;
public class Solution {
	public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
       System.out.print((n * (n + 1) *  
               (2 * n + 1)) / 6 );
    }
}
