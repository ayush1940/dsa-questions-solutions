package hackerearth;
import java.util.*;
public class numberfinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int k=sc.nextInt();
		int product=1;
		int c=1;
		for(int i=a;i<b;i++) {
			for(int j=0;j<b;j++) {
			 c=(int)Math.pow(i+j, k);
				int temp=c;
				while(temp>0) {
				int lastdigit=c%10;
				c/=10;
				product*=lastdigit;
				temp--;
				}
				
			}
		}
		int m=(int)Math.sqrt(product);
		if(product!=0 && m*m==product) {
			System.out.println(c);
		}
		else {
			System.out.println("-1");
		}
	}

}
