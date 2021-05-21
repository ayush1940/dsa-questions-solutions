package hackerearth;
import java.util.*;
public class character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int count1=0;
			int count2=0;
			int n=sc.nextInt();
			int k=sc.nextInt();
			String s=sc.next();
			for(int i=0;i<n;i++) {
				Character c = s.charAt(i); 
	            if (Character.isLowerCase(c))  {
					count1++;
				}
	            if (Character.isUpperCase(c))  {
					count2++;
				}
			}
			if(count1<k||count2<k) {
				System.out.println("none");
			}
			else if(count1==count2) {
				System.out.println("both");
			}
			else if(count1==k&&count2>count1) {
				System.out.println("brother");
			}
			else if(count2==k&&count1>count2) {
				System.out.println("chef");
			}
		}

	}

}
