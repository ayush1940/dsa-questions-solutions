package gfg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import gfg.Graph.Edge;
public class graphp{
	static class Edge{
		int src;
		int nbr;
		int wt;
		Edge(int src,int nbr,int wt){
			this.src=src;this.nbr=nbr;this.wt=wt;
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		 //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v=sc.nextInt();
		// int v = Integer.parseInt(br.readLine());
		ArrayList<Edge> graph[]=new ArrayList[v];
		for(int i=0;i<v;i++) {
			graph[i]=new ArrayList<>();
		}
		int e=sc.nextInt();
		
		 //int e = Integer.parseInt(br.readLine());
		for(int i=0;i<e;i++) {
                String s=sc.nextLine();
                String [] parts=s.split(" ");
	            int v1 = Integer.valueOf(parts[0]);
	            int v2 = Integer.valueOf(parts[1]);
	            int wt = Integer.valueOf(parts[2]);
	            graph[v1].add(new Edge(v1, v2, wt));
	            graph[v2].add(new Edge(v2, v1, wt));
			
		}
//		for(int i=0;i<e;i++) {
//			String parts[]=s.split(" ");
//		}
		int src=sc.nextInt();
		int dest=sc.nextInt();
//		int src = Integer.parseInt(br.readLine());
//        int dest = Integer.parseInt(br.readLine());
		
		boolean visited[]=new boolean[v];
		boolean path=haspath(graph,src,dest,visited);
		System.out.println(path);
	}
	
	public static boolean haspath(ArrayList<Edge> graph[],int source,int destination,boolean visited[]) {
		if(source==destination) {
			return true;
		}
		 visited[source]=true;
		for(Edge edge:graph[source]) {
			if(visited[edge.nbr]==false) {
				if(haspath(graph,edge.nbr,destination,visited)==true) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}