package AlphabetPattern;

import java.util.Scanner;

public class AlphaM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = in.nextInt();

		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(j==1 || i==j && i<=n/2+1 || i==n-(j-1) && i<=n/2 || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
}