package pattern;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of pattern");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for (int j=1;j<=4*i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<(n-i+1);j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		}
		

}
