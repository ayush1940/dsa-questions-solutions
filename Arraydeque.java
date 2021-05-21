package hackerearth;
import java.util.*;
public class Arraydeque {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>al=new ArrayList<>();
		sc.useDelimiter("\\D");
		int a[]=new int[5];
		int prd=1;
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
			for(int i=0;i<5;i++) {
				int temp=a[i];
				a[i]=a[4];
				a[4]=temp;
				
			}
		for(int i=0;i<5;i++) {
			System.out.print(a[i]);
		}
		//System.out.println(al);
		
	}
   }
