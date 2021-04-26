package L1_Basics;

import java.util.Scanner;

public class ifelseif_conditionals {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		if(n > 90 && n <= 100) {
			System.out.println("A grade");
		}
		if(n > 80 && n <= 90) {
			System.out.println("B grade");
		}
		if(n > 70 && n <= 80) {
			System.out.println("C grade");
		}
		if(n > 60 && n <= 70) {
			System.out.println("D grade");
		}

	}

}
