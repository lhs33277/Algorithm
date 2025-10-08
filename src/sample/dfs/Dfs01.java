package sample.dfs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dfs01 {

public static void main(String[] args) throws IOException {
		
		int N = 4; // 노드 수
		
		@SuppressWarnings("unchecked")
		List<Integer>[] graph = new ArrayList[N + 1];
		
		for(int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		graph[1].add(2);
        graph[1].add(3);
        graph[2].add(1);
        graph[2].add(4);
        graph[3].add(1);
        graph[4].add(2);
        
        boolean[] visited = new boolean[N + 1];
        
        dfs(1, graph, visited);
		
	}
	
	static void dfs(int node, List<Integer>[] graph, boolean[] visited) {
		
		visited[node] = true;
		System.out.println("방문한 노드 : " + node);
		
		for(int next : graph[node]) {
			if(!visited[next]) {
				dfs(next, graph, visited);
			}
		}
	}

}
