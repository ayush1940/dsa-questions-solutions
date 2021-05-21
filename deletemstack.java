package gfg;
import java.util.*;
public class deletemstack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        	stack.push(a[i]);
        }
        System.out.println(stack);
//        System.out.println("Delete element from middle");
//        int b=n/2;
//        System.out.println(stack.remove(b));
//        System.out.println("new stack is ");
//        System.out.println(stack);
        while(!stack.isEmpty()) {
        	System.out.print(stack.pop());
        	
        }
       // System.out.println(stack);
        
	}

}
