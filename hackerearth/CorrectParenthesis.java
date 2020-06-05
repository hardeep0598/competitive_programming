package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorrectParenthesis {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[] c=br.readLine().toCharArray();
        int n=c.length, bal = 0, count = 0, min = Integer.MAX_VALUE;
        for (int i=0;i<n;i++) {
            if(c[i] == '(')
                bal++;
            else
                bal--;
            if (min > bal) {
                min = bal;
                count = 0;
            }
            if (min == bal)
                count++;
        }
        if (bal > 0 || bal < 0)
            System.out.println("0");
        else
            System.out.println(count);
	}

}
