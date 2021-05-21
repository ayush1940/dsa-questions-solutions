package hackerearth;
import java.util.*;
public class Factorexist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>al=new ArrayList<>();
		ArrayList<Integer>sm=new ArrayList<>();
		sc.useDelimiter("\\D");
		int a[]=new int[3];
		int sum=0;
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
			al.add(a[i]);
		}
		for(int i=0;i<3;i++) {
			for(int j=1;j<a[i];j++) {
				if(a[i]%j==0) {
					sum+=j;
					
				}
				sm.add(sum);
			}
		}
		System.out.println(sm);
	}

}
