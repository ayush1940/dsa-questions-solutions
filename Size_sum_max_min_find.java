package binarysearchtree;
import java.util.*;
public class Size_sum_max_min_find {
    public static class Node{
    	int data;
    	Node left;
    	Node right;
    	Node(int data,Node left,Node right){
    		this.data=data;this.left=left;this.right=right;
    	}
    }
    public static class pair{
    	Node node;
    	int state;
    	pair(Node node,int state){
    		this.state=state;
    		this.node=node;
    	}
    }
    public static int size(Node node) {
    	if(node==null) {
    		return 0;
    	}
    	int lc=size(node.left);
    	int rc=size(node.right);
    	return lc+rc+1;
    }
    public static int sum(Node node) {
    	if(node==null) {
    		return 0;
    	}
    	int lc=size(node.left);
    	int rc=size(node.right);
    	return lc+rc+node.data;
    }
    public static int max(Node node) {
    	if(node.right!=null) {
    		return max(node.right);
    	}
    	else {
    		return node.data;
    	}
    }
    public static void main(String[] args) {
    	
    }
}
