package hackerearth;
import java.util.*;
public class Onsort {
	  public static void printArray(int arr[], int N)
	{
	     
	    // Traverse the array
	    for(int i = 0; i < N; i++)
	    {
	       System.out.println(arr[i]);
	    }
	}
	
	public static void sortArray(int arr[], int N)
	{
	 
	    // Traverse the array
	    for(int i = 0; i < N;i++)
	    {
	 
	       // If the current element is
	       // at correct position
	       if (arr[i] == i + 1)
	       {
	           i++;
	       }
	        
	       // Else swap the current element
	       // with it's correct position
	       else
	       {
	           // Swap the value of
	           // arr[i] and arr[arr[i]-1]
	           int temp1 = arr[i];
	           int temp2 = arr[arr[i] - 1];
	           arr[i] = temp2;
	           arr[temp1 - 1] = temp1;
	       }
	    }
	}
	 
	// Driver Code   
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int a[]=new int[n];
	      for(int i=0;i<n;i++){
	          a[i]=sc.nextInt();
	      }
//	      for(int i=0;i<n;i++){
//	          System.out.println(a[i]);
//	      }
	    
	    sortArray(a, n);
	 
	    // Function call to print the array
	    printArray(a, n);
	}

	}



