package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinSteps {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int cost=0;
		cost+= n/5;
	    n %= 5;
	    cost+= n/4;
	    n %= 4;
	    cost+= n/3;
	    n %= 3;
	    cost+= n/2;
	    n %= 2;
	    cost+= n/1;
	    n %= 1;
				System.out.print(cost);

	}

}
