package sample.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi {

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	hanoi(N, 1, 3, 2);
    	System.out.println((int)Math.pow(2, N) - 1);
    	System.out.println(sb);
    }
    
    static void hanoi(int n, int from, int to, int tmp) {

    	if(n == 1) {
    		sb.append(from).append(" ").append(to).append("\n");
    		return;
    	}
    	
    	hanoi(n-1, from, tmp, to);
    	
    	sb.append(from).append(" ").append(to).append("\n");
    	
    	hanoi(n - 1, tmp, to, from);
    	
    }
}
