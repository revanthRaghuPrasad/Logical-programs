package Pattren;

import java.util.Scanner;

public class RevStarPat3 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the value of n ");
		 int n = in.nextInt();
		 int st = 2*n-1;
		 for(int i=1; i<=n ;i++){
			 for(int j=1; j<=i-1; j++){
				 System.out.print("  ");
			 }
			 for(int j=1; j<=st; j++){
				 System.out.print("* ");
			 }
			 st=st-2;
			 System.out.println();
		 }
	}

}
