package gfg;
import java.util.*;
public class countpair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> l1=new LinkedList<>();
		List<Integer>l2=new LinkedList<>();
		int x=15;
		int count=0;
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		for(int i=0;i<n1;i++) {
			a[i]=sc.nextInt();
			l1.add(a[i]);
		}
		for(int j=0;j<n2;j++) {
			b[j]=sc.nextInt();
			l2.add(b[j]);
		}
		for(int i=0;i<n1;i++) {
			for(int j=i+1;j<n2;j++) {
				if(a[i]+b[j]==x) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
