package maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Biginteger{
	public static void main(String[] args)  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BigInteger A=new BigInteger("-100");
		BigInteger B=A.abs();
		System.out.println(B);
	}

}
