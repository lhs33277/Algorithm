package sample.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutation {

	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	int[] arr = new int[M];
    	boolean[] isVisit = new boolean[N + 1];
    	
    	int depth = 0;
    	backT(depth, arr, isVisit);
    	
    	System.out.println(sb);
    }
    
    static void backT(int depth, int[] arr, boolean[] isVisit) {
    	
    	if(depth == M) {
    		for(int i = 0; i < M; i++) {
    			sb.append(arr[i]).append(' ');
    		}
    		sb.append('\n');
    		return;
    	}
    	
    	for(int i = 1; i <= N; i++) {
    		
    		if(!isVisit[i]) {
    			
    			isVisit[i] = true;
    			arr[depth] = i;
    			backT(depth + 1, arr, isVisit);
    			isVisit[i] = false;
    		}
    	}
    	
    }
}
