package gfg;

import java.util.Scanner;

public class IsFibo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a=5*n*n+4;
			int b=5*n*n-4;
			int c=(int)Math.sqrt(a);
			int d=(int)Math.sqrt(b);
			if(c*c==a||d*d==b) {
				System.out.println("IsFibo");
			}else {
				System.out.println("IsNotFibo");
			}
		
		}
	}
}