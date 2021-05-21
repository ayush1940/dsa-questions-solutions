package gfg;
import java.util.*;
public class deletelist {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	List<Integer>l1=new LinkedList<>();
//	  int n=sc.nextInt();
//	int a[]=new int[n];
//	  for(int i=0;i<n;i++) {
//		a[i]=sc.nextInt();
//		l1.add(a[i]);
//	}
//	  for(int i=0;i<n;i++) {
//		 if(a[i]==2) {
//			 
//		 l1.remove(i);
//		  }
//		
//	  }
//	  System.out.println(l1);
	int n=sc.nextInt();
	int a[]=new int[n] ;
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	List<Integer>l1=Arrays.asList(a);
	}
}
