

package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Watermelon {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int w=Integer.parseInt(br.readLine());
		if(w%2==0) {
			if(w<=2) {
			System.out.print("NO"); }
			else {
				System.out.print("YES");
			}
		}
		else {
			System.out.print("NO");
		}

	}

}
