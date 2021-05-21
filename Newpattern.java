package pattern;

import java.util.Scanner;

public class Newpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<9;i++)
		{
			if(i==0) {
				for(int j=0;j<9;j++) {
			System.out.print(5+" ");}
			}
			else if(i==1)
			{
				System.out.print(5+" ");
				for(int j=0;j<7;j++) {
				System.out.print(4+" ");}
				System.out.print(5);
				}
			else if(i==2)
			{
				System.out.print("5 ");
				System.out.print("4 ");
				for(int j=0;j<5;j++)
				{
					System.out.print("3 ");
				}
				System.out.print("4 ");
				System.out.print("5 ");
			}
			else if(i==3)
			{
				System.out.print("5 ");
				System.out.print("4 ");
				System.out.print("3 ");
				for(int j=0;j<3;j++)
				{
					System.out.print("2 ");
				}
				System.out.print("3 ");
				System.out.print("4 ");
				System.out.print("5 ");
			}
			else if(i==4)
			{
				System.out.print("5 ");
				System.out.print("4 ");
				System.out.print("3 ");
				System.out.print("2 ");
				System.out.print("1 ");
				System.out.print("2 ");
				System.out.print("3 ");
				System.out.print("4 ");
				System.out.print("5 ");
				
			}
			
			else if(i==5)
			{
				System.out.print("5 ");
				System.out.print("4 ");
				System.out.print("3 ");
				for(int j=0;j<3;j++)
				{
					System.out.print("2 ");
				}
				System.out.print("3 ");
				System.out.print("4 ");
				System.out.print("5 ");
			}
			else if (i==6)
			{
				System.out.print("5 ");
				System.out.print("4 ");
				for(int j=0;j<5;j++)
				{
					System.out.print("3 ");
				}
				System.out.print("4 ");
				System.out.print("5 ");
			}
			else if(i==7)
			{

				System.out.print(5+" ");
				for(int j=0;j<7;j++) {
				System.out.print(4+" ");}
				System.out.print(5);
			}
			else if(i==8)
			{
				for(int j=0;j<9;j++) {
					System.out.print(5+" ");}
			}
			System.out.println();
		}

	}

}
