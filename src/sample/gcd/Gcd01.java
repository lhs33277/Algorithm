package sample.gcd;

/*
 * GCD(x, y) = GCD(y, x % y)
 * x * y = LCM * GCD
 */
public class Gcd01 {

	public int GCD(int a, int b) {

		int x = a;
		int y = b;

		while(y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}

		return x;
	}
	
	public int LCM(int a, int b, int gcd) {
		
		int lcm = (a * b) / gcd;
		return lcm;
		
	}

}
