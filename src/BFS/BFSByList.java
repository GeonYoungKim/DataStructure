package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSByList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int V=sc.nextInt();
		int E=sc.nextInt();
		
		boolean[] visited=new boolean[V+1];
		
		
		ArrayList<ArrayList<Integer>> ad=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<V+1;i++) {
			ad.add(new ArrayList<Integer>());
		}
		for(int i=0;i<E;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			ad.get(a).add(b);
			ad.get(b).add(a);
		}
		visited[1]=true;
		
		Queue<Integer> queue=new LinkedList<>();
		queue.add(1);
		
		bfs(ad,visited,queue,"1");
	}
	public static void bfs(ArrayList<ArrayList<Integer>> ad,boolean[] visited,Queue<Integer> queue,String path) {
		int size=queue.size();
		
		while(size-->0) {
			int location=queue.poll();
			for(int i=0;i<ad.get(location).size();i++) {
				if(visited[ad.get(location).get(i)]==false) {
					queue.add(ad.get(location).get(i));
					path+=String.valueOf(ad.get(location).get(i));
					visited[ad.get(location).get(i)]=true;
				}
			}
		}
		
		if(queue.size()!=0) {
			bfs(ad,visited,queue,path);
		}else {
			System.out.println(path);
		}
	}

}
