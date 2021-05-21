package hackerearth;
import java.util.*;
public class reversedeque {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  Queue<Integer>deck=new LinkedList<>();
        int n=sc.nextInt();
        int k=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++) {
        	  a[i]=sc.nextInt();
        	  deck.add(a[i]);
          }
         
        	while(!deck.isEmpty()) {
        		int b=deck.remove();
        		if(deck.peek()==k) {
            	   for(int i=k;i>1;i--) {
            		   System.out.println(k);
            	   }
            	}
        	}
        	
         }
	}


