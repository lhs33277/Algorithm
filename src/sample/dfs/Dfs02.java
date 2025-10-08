package sample.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Dfs02 {

	static int cnt = 1;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 정점 수
		int M = Integer.parseInt(st.nextToken()); // 간선 수
		int R = Integer.parseInt(st.nextToken()); // 시작 지점

		@SuppressWarnings("unchecked")
		List<Integer>[] graph = new ArrayList[N + 1];

		for(int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {

			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph[u].add(v);
			graph[v].add(u);

		}

		int[] order = new int[N + 1];

		dfs(R, graph, order);

		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) {
			sb.append(order[i]).append("\n");
		}

		System.out.println(sb);

	}

	static void dfs(int R, List<Integer>[] graph, int[] order) {

		order[R] = cnt++;

		Collections.sort(graph[R], new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		for(int next : graph[R]) {
			if (order[next] == 0) {
				dfs(next, graph, order);
			}
		}

	}
}
