package sample.bfs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs01 {

public static void main(String[] args) throws IOException {
		
		int N = 6; // 노드 수
		
		@SuppressWarnings("unchecked")
		List<Integer>[] graph = new ArrayList[N + 1];
		
		for(int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		graph[1].add(2);
        graph[1].add(3);
        graph[2].add(4);
        graph[2].add(5);
        graph[3].add(6);
        
        bfs(1, graph);
		
	}
	
	static void bfs(int start, List<Integer>[] graph) {
		
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll(); // 큐에서 꺼내기
            System.out.println("방문한 노드: " + node);

            for (int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
