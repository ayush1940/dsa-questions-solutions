package hackerearth;

import java.io.*; 
import java.util.*;
 
class GFG { 
  
static void show(int arr[], int n) 
{
    System.out.print("{");
     
    for(int i = 0; i < n - 1; i++)
       System.out.print(arr[i] + ", ");
 
    System.out.print(arr[n - 1] + "}");         
} 
 
public static void flipHalf(int arr[], int n) 
{ 
    int c = 0; 
    int dup = n; 
    Stack<Integer> st = new Stack<>(); 
     
    for(int i = 0; i < n; i++) 
    { 
       int x = arr[i]; 
        
       if (c % 2 == 1)
       {
           st.push(x);
       }
       c++; 
    } 
    c = 0; 
 
    for(int i = 0; i < n; i++) 
    { 
       int x = arr[i]; 
        
       if (c % 2 == 1) 
       { 
           x = st.peek(); 
           st.pop(); 
       } 
       arr[i] = x; 
       c++; 
    } 
} 
 

public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 3, 4, 5, 6 }; 
    int n = arr.length; 
     
    flipHalf(arr, n); 
    show(arr, n); 
}     
} 
