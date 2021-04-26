package L1_Basics;

import java.util.Scanner;

public class PrimeNum3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int count = 2;
		int fact = 0;
		int val=n/2;
		while(count <= val) {
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
