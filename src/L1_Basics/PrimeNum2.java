package L1_Basics;

import java.util.Scanner;

public class PrimeNum2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int fact = 0;
		int count = 2;
		
		while(count <= n-1) {
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
