package hackerearth;
import java.util.*;
public class Matrixcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int count1=1;
			int count2=1;
			char a[][]=new char[n][m];
			for(int i=0;i<n;i++){
			      String s=sc.next();
			      for(int j=0;j<m;j++)
			      a[i][j]=s.charAt(j);
			    }
			for(int i=0;i<n;i++) {
				for(int j=0;j<m-1;j++) {
					if(a[i][j]==a[i][j+1]) {
						count1++;
					}
					
				}
			}
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<m;j++) {
					if(a[i][j]==a[i+1][j]) {
						count2++;
					}
					
				}
			}
			System.out.println(Math.max(count1, count2));
			
		}
	}

}
