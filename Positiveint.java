package hackerearth;
import java.util.*;
public class Positiveint {
	
	    static int solution(int[] A)
		{
			int n = A.length;

			boolean[] present = new boolean[n + 1];
			for (int i = 0; i < n; i++) {
				if (A[i] > 0 && A[i] <= n)
					present[A[i]] = true;
			}
			for (int i = 1; i <= n; i++)
				if (!present[i])
					return i;
			return n + 1;
		}
		public static void main(String[] args)
		{
	       Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
	    	Scanner tk=new Scanner(s);
			sc.useDelimiter(" ");
			 String s1[]=s.split(", ");
			int a[]=new int[s1.length];
			
			for(int i=0;i<s1.length;i++) {
				a[i]=Integer.parseInt(String.valueOf(s1[i]));
			}
	        System.out.println(solution(a));
		}
}
