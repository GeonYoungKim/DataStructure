package DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class DFSByList {
	
	
	public static void dfs(ArrayList<ArrayList<Integer>> ad,int num,boolean[] visited) {
		System.out.println(num);
		visited[num]=true;
		for(int i=0;i<ad.get(num).size();i++) {
			if(visited[i]==false) {
				dfs(ad,ad.get(num).get(i),visited);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int V=sc.nextInt();
		int E=sc.nextInt();
		
		boolean[] visited=new boolean[V];
		
		
		ArrayList<ArrayList<Integer>> ad=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<V;i++) {
			ad.add(new ArrayList<Integer>());
		}
		for(int i=0;i<E;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			ad.get(a).add(b);
			ad.get(b).add(a);
		}
		
		dfs(ad,0,visited);
		
	}
	
	

}
