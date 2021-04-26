package L1_Basics;

import java.util.Scanner;

public class HCF1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int min = Math.min(a, b);
		
		int div = min;
		
		while(div >= 1) {
			if(a % div == 0 && b % div == 0) {
				System.out.println(div);
				break;
			}
			div = div - 1;
		}
	}
}
