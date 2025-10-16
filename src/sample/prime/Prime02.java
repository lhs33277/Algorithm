package sample.prime;

public class Prime02 {

	public void primeSet(boolean[] isPrime, int n) {

		isPrime[0] = false;
		isPrime[1] = false;

		for(int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}
		
		for(int i = 2; i * i <= n; i++) {
			
			if(isPrime[i]) {
				
				for(int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		
	}
	
	
}
