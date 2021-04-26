package L1_Basics;

import java.util.Scanner;

public class PrimeNum3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int count = 1;
		int fact = 0;
		
		while(count <= n/2) {
			if(n % count == 0) {
				fact = fact + 1;
				break;
			}
			count = count + 1;
		}
		
		if(fact > 0) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime");
		}
		
		

	}

}
