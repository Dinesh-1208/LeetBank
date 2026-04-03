package Geek_onacci_number;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) {
		// code here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(solve(a, b, c, n));
		}
	}

	static int solve(int a, int b, int c, int n) {
		if (n == 1)
			return a;
		if (n == 2)
			return b;
		if (n == 3)
			return c;
		return solve(a, b, c, n - 3) + solve(a, b, c, n - 2) + solve(a, b, c, n - 1);
	}
}
