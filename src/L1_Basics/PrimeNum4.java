package L1_Basics;

import java.util.Scanner;

public class PrimeNum4 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int div = 2;
		int fact = 0;

		
			while (div <= Math.sqrt(n)) {// div * div = n
//				if (n == 0 || n == 1) {
//					System.out.println("Not Prime");
//					break; }
				if (n % div == 0) {
					fact = fact + 1;
					break;
				}
				div = div + 1;
			}
		
	if(fact>0)
	{
		System.out.println("Not Prime");
	}else
	{
		System.out.println("Prime");
	}
	}
}
