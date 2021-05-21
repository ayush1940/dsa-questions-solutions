package pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		//int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of pattern");
		int n=sc.nextInt();
		System.out.println("+");
		for(int j=2;j<=n-1;j++)
		{
		System.out.print("+ ");
	           for(int k=0;k<j-2;k++)
			{
				System.out.print("  ");
			}
	           System.out.print("+ ");
	           System.out.println();
		}
		
	     for(int j=1;j<=n;j++)
		{
			System.out.print("+ ");
		}

	}

}
