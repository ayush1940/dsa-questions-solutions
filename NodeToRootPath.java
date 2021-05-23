package generictree;
import java.util.*;

import generictree.MIrror.Node;
public class NodeToRootPath {
public static class Node{
	int data;
	ArrayList<Node>children=new ArrayList<>();
}
public static ArrayList<Integer> nodetopath(Node node,int data){
	if(node.data==data) {
		ArrayList<Integer> ptc=new ArrayList<>();
		ptc.add(node.data);
		return ptc;
	}
	for(Node child:node.children) {
		ArrayList<Integer> ptc=nodetopath(child,data);
		if(ptc.size()>0) {
			ptc.add(node.data);
			return ptc;
		}
	}
	return new ArrayList<>();
}
	public static void main(String[] args) {
		int arr[]= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
		   Node root=null;
		   Stack<Node> st=new Stack<>();
		   for(int i=0;i<arr.length;i++) {
			   if(arr[i]==-1) {
				   st.pop();
			   }else {
				   Node t=new Node();
				   t.data=arr[i];
				   if(st.size()>0) {
					   st.peek().children.add(t);
				   }else {
					   root=t;
				   }
				   st.push(t);
			   }
			   
		   }
		 ArrayList<Integer> path=nodetopath(root,110);
		 System.out.println(path);

	}

}
