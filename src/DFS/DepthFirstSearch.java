package DFS;


/*
 * 인접행렬을 통한 깊이우선 탐색. 재귀를 통하여 가장 먼저 연결 및 방문 하지 않은 노드를 탐색한다.
*/
public class DepthFirstSearch {
	public static void main(String[] args) {
		int[][] array= {
				{0,1,1,0},
				{1,0,0,1},
				{1,0,0,1},
				{0,1,1,0}
		};
		
		int[] visited=new int[array.length];
		String path="1";
		visited[0]=1;
		
		path=dfs(array,visited,0,path);
		System.out.println(path);
		
	}
	
	public static String dfs(int[][] array,int[] visited,int location,String path) {
		
		for(int i=0;i<array[location].length;i++) {
			if(array[location][i]==1&&visited[i]==0) {
				visited[i]=1;
				path+=String.valueOf(i+1);
				path=dfs(array,visited,i,path);
			}
		}
		return path;
		
	}

}
