package gfg;
import java.io.*;
import java.util.*;
public class Bipirattegraph {
	static class Edge{
		int src;int nbr;
		Edge(int src,int nbr){
			this.src=src;this.nbr=nbr;
		}
	}
	static class pair{
		int v;String psf;int level;
		pair(int v,String psf,int level ){
			this.v=v;this.psf=psf;this.level=level;
		}
	}
	public static void main(String [] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int v=Integer.parseInt(br.readLine());
		ArrayList<Edge>graph[]=new ArrayList[v];
		for(int i=0;i<v;i++) {
			graph[i]=new ArrayList<>();
		}
		int e=Integer.parseInt(br.readLine());
		for(int i=0;i<e;i++) {
			String parts[]=br.readLine().split(" ");
			int v1=Integer.parseInt(parts[0]);
			int v2=Integer.parseInt(parts[1]);
			graph[v1].add(new Edge(v1,v2));
			graph[v2].add(new Edge(v2,v1));
		}
		int visited[]=new int [v];
		Arrays.fill(visited,-1);
		for(int i=0;i<v;i++) {
			if(visited[i]==-1) {
				boolean check=bipirate(graph,i,visited);
				if(check==true) {
					System.out.println(true);
					return;
				}
				}
			}
		System.out.println(false);
		}
	
	public static boolean bipirate(ArrayList<Edge>graph[],int src,int visited[]) {
		ArrayDeque<pair>q=new ArrayDeque<>();
		q.add(new pair(src,src+"",0));
		while(q.size()>0) {
			pair rem=q.removeFirst();
			if(visited[rem.v]!=-1) {
				if(visited[rem.v]==rem.level) {
					return true;
				}
			}
			else {
				visited[rem.v]=rem.level;
			}
			for(Edge e:graph[rem.v]) {
				if(visited[rem.v]==-1) {
					q.add(new pair(e.nbr,rem.psf+e.nbr,rem.level+1));
				}
			}
		}
		return false;
	}
}
