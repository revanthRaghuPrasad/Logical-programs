package Pattren;

import java.util.Scanner;

public class NamePat3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s= in.next();
		for(int i=0;i<s.length();i++){
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}

}
