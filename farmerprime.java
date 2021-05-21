package hackerearth;
import java.util.*;
public class farmerprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count=0;
		while(t-->0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			for(int i=1;i<=100;i++) {
				for(int j=1;j<=100;j++) {
					int z=x+y+i;
					if(z%i==0) {
						count+=1;
					}
					if(count==2) {
						System.out.println(i);
					}
				}
				
		}
		
		}
         
	}

}
