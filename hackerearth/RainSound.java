package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RainSound {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s[];
		int t=Integer.parseInt(br.readLine());
		int wer=0,wer2=0;
		while(t-->0) {
			s=br.readLine().split(" ");
			int l=Integer.parseInt(s[0]);
			int h=Integer.parseInt(s[1]);
			int ss=Integer.parseInt(s[2]);
			if (((l - 1) / ss + 1) * ss > h) {
                System.out.println("-1"+" -1");
            } else {
            	wer=((l - 1) / ss + 1);
            	wer2=(h / ss);
                System.out.println(wer+" "+wer2);
            }
		}
	}

}
