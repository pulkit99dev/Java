package Patterns;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		// straight line of * vertically
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = 1;
		
		while(r <= n) {
			System.out.print("*");
			
			System.out.println();
			r =  r + 1;
		}
		
//		for(int r=0; r<=n ; r++) {
//			System.out.println("*");
//		}

	}

}
