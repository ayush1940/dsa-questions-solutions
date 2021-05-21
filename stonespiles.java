package hackerearth;
import java.util.*;
public class stonespiles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
	       int a=sc.nextInt();
	       int b=sc.nextInt();
	       int c=sc.nextInt();
	       int x=sc.nextInt();
	       int y=sc.nextInt();
	       if(c==Math.abs(a-x)+Math.abs(b-y)||b==Math.abs(a-x)+Math.abs(c-y)||a==Math.abs(b-x)+Math.abs(c-y)){
	           System.out.println("YES");
	       }else{
	           System.out.println("NO");
	       }
		}

	}

}
