package L1_Basics;

import java.util.Scanner;

public class PrimeNum1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int fact = 0;
		
		int count = 1;
		
		while(count <= n) {
			if(n % count == 0) {
				fact = fact + 1;
			}
			count = count + 1;
		}
		
		if( fact > 2) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime");
		}

	}

}
