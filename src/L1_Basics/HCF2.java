package L1_Basics;

import java.util.Scanner;

public class HCF2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int min = Math.min(a, b);
		
		int hcf = 0;
		
		int div = 1;
		
		while(div <= min) {
			if(a % div == 0 && b % div == 0) {
				hcf = div;
			}
			div++;
		}
		System.out.println(hcf);
	}

}
