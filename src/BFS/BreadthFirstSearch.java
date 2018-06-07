package BFS;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 인접행렬을 통한 너비우선탐색. 큐를 활용하여 탐색을 한다.
*/
public class BreadthFirstSearch {
	
	public static void main(String[] args) {
		int[][] array= {
				{0,1,1,0},
				{1,0,0,1},
				{1,0,0,1},
				{0,1,1,0}
		};
		
		int[] visited=new int[array.length];
		
		visited[0]=1;
		
		Queue<Integer> queue=new LinkedList<>();
		queue.add(0);
		
		bfs(array,visited,queue,"1");
	}
	public static void bfs(int[][] array,int[] visited,Queue<Integer> queue,String path) {
		int size=queue.size();
		
		while(size-->0) {
			int location=queue.poll();
			for(int i=0;i<array[location].length;i++) {
				if(visited[i]==0&&array[location][i]==1) {
					queue.add(i);
					path+=String.valueOf(i+1);
					visited[i]=1;
				}
			}
		}
		
		if(queue.size()!=0) {
			bfs(array,visited,queue,path);
		}else {
			System.out.println(path);
		}
	}

}
