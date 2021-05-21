package gfg;
import java.io.*;
import java.util.*;
public class Allpathgraph {
 static class Edge{
	int vtces; int nbr;int wt;
	Edge(int vtces,int nbr,int wt){
		this.vtces=vtces;this.nbr=nbr;this.wt=wt;
	}
 }
	public static void main(String [] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int vtces=Integer.parseInt(br.readLine());
		ArrayList<Edge>graph[]=new ArrayList[vtces];
		int edge=Integer.parseInt(br.readLine());
		for(int i=0;i<vtces;i++) {
			graph[i]=new ArrayList<>();
		}
		for(int i=0;i<edge;i++) {
			String parts[]=br.readLine().split(" ");
			int v1=Integer.parseInt(parts[0]);
			int v2=Integer.parseInt(parts[1]);
			int wt=Integer.parseInt(parts[2]);
			graph[v1].add(new Edge(v1,v2,wt));
			graph[v2].add(new Edge(v2,v1,wt));
		}
		int src=Integer.parseInt(br.readLine());
		int dest=Integer.parseInt(br.readLine());
		boolean visited[]=new boolean[vtces];
		printpath(graph,src,dest,visited,src);
	}
	
 public static void printpath(ArrayList<Edge> graph[],int src,int destination,boolean visited[],String psf) {
	 if(src==destination) {
		 System.out.println(psf);
		 return;
	 }
	 visited[src]=true;
	 for(Edge e:graph[src]) {
		 if(visited[e.nbr]==false) {
			 printpath(graph,e.nbr,destination,visited,psf+e.nbr);
		 }
	 }
	 visited[src]=false;
 }
}
