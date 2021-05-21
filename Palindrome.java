package hackerearth;
import java.util.*;
public class Palindrome{
	public static int findp(int n) {
		int temp=n;int sum=0;
		while(n>0) {
			int last=n%10;
			sum=sum*10+last;
			n/=10;
		}
		return sum;
	}
	public static boolean checkp(int num) {
		if(num==findp(num)) {
			return true;
		}
		return false;
	}
	public static void addp(int number) {
		while(!checkp(number)) {
			int reverse=findp(number);
			int sum=reverse+number;
			if(sum==findp(sum)) {
			System.out.println(sum);
			}
			number=sum;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		addp(n);
		
	}

}
