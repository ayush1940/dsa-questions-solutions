package generictree;
import java.util.*;
public class linewise {
	public static class Node{
		int data;
		ArrayList<Node>children=new ArrayList<>();
	}
	public static void linewisetraversal(Node node) {//add node in main queue then remove until size becomes 0 then add its children
		//to children node if main queue size==0 then take cq in mq and new the cq and just enter to print in new line.
		Queue<Node> mq=new ArrayDeque<>();
		Queue<Node> cq=new ArrayDeque<>();
		mq.add(node);
		while(mq.size()>0) {
			node=mq.remove();
			System.out.print(node.data+" ");
			for(Node child:node.children) {//first add node then remove,print then add its children.
			cq.add(child);
			}
			if(mq.size()==0) {
				mq=cq;
				cq=new ArrayDeque<>();
				System.out.println();
			}
		}
	}
	public static void zigzag(Node node) {
		Stack<Node> mst=new Stack<>();
		Stack<Node>cst=new Stack<>();
		mst.push(node);
		int level=1;
		while(mst.size()>0) {
			node=mst.pop();
			System.out.print(node.data+" ");
			if(level%2==1) {
				for(int i=0;i<node.children.size();i++) {
					Node child=node.children.get(i);
					cst.push(child);
					
				}
			}else {
				for(int i= node.children.size();i>=0;i--) {
					Node child=node.children.get(i);
					cst.push(child);
				}
			}
			if(mst.size()==0) {
				mst=cst;
				cst=new Stack<>();
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};
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
		   //linewisetraversal(root);
		   zigzag(root);
	}

}
