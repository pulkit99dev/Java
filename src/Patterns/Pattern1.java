package Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int r = 1;
		
		while(r <= n) {
			
			for(int c = 1; c <= n; c++) {
				System.out.print("*");
			}
			
			System.out.println();
			r = r + 1;
		}
		

	}

}
