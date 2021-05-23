package generictree;
import java.util.*;

import generictree.Max_in_generictree.Node;
public class height_of_tree {
public static class Node{
	int data;
	ArrayList<Node> children=new ArrayList<>();
}
public static int height(Node node) {
	int ht=0;
	for(Node child:node.children) {
		int hit=height(child);
		ht=Math.max(ht, hit);
	}
	ht+=1;
	return ht;
}
	public static void main(String[] args) {
		int arr[]= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};
		Node root=null;
		Stack<Node> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==-1) {
				st.pop();
			}else{
				Node t=new Node();
				t.data=arr[i];
				if(st.size()>0) {
					st.peek().children.add(t);
				}else {
					root=t;
				}
			}
			st.push(root);
		}
		System.out.println(height(root));

	}

}
