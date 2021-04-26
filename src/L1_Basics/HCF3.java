package L1_Basics;

import java.util.Scanner;

public class HCF3 {

	public static void main(String[] args) {
		
		// Long Division approach
		
		Scanner scn = new Scanner(System.in);
		int divident = scn.nextInt();
		int divisor = scn.nextInt();
		
		while(true) {
			int remainder = divident % divisor;
			if(remainder == 0) {
				break;
			}
			divident = divisor;
			divisor = remainder;
		}
		System.out.println(divisor);

	}

}
