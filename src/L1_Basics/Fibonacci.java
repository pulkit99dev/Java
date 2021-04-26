package L1_Basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int a = 0;
		int b = 1;
		int sum = 0;
		int count = 1;
		
		while(count <= n) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
			count++;
		}
		System.out.println(sum);
	}

}
