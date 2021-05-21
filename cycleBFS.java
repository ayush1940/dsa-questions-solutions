package gfg;
import java.util.*;
import java.io.*;
public class cycleBFS {
  static class Edge{
	  int src;int nbr;
	  Edge(int src,int nbr){
		  this.src=src;this.nbr=nbr;
	  }
  }
  static class pair{
	  int v;String psf;
	  pair(int v,String psf){
		  this.v=v;this.psf=psf;
	  }
  }
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int v=Integer.parseInt(br.readLine());
		ArrayList<Edge>graph[]=new ArrayList[v];
		for(int i=0;i<v;i++) {
			graph[i]=new ArrayList<>();
		}
		int edge=Integer.parseInt(br.readLine());
		for(int i=0;i<edge;i++) {
			String parts[]=br.readLine().split(" ");
			int v1=Integer.parseInt(parts[0]);
			int v2=Integer.parseInt(parts[1]);
			graph[v1].add(new Edge(v1,v2));
			graph[v2].add(new Edge(v1,v1));
		}
		
		boolean visited[]=new boolean[v];
		for(int i=0;i<v;i++) {
			if(visited[i]==false) {
				if(iscyclic(graph,i,visited)) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}
			}
		}
		
	}
	public static boolean iscyclic(ArrayList<Edge>graph[],int src,boolean visited[]) {
		ArrayDeque<pair> q=new ArrayDeque<>();
		q.add(new pair(src,src+""));
		while(q.size()>0) {
			pair rem=q.removeFirst();
			if(visited[rem.v]==true) {
				return true;
			}
			visited[rem.v]=true;
			for(Edge e:graph[rem.v]) {
				if(visited[e.nbr]==false) {
					q.add(new pair(e.nbr,rem.psf+e.nbr));
				}
			}
		}
		return false;
	}
}
