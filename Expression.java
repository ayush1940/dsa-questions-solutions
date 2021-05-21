package hackerearth;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			 if(a[i]%101==0) {
				 System.out.print(a[i]);
			 }
		}

	}

}
