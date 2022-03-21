package problem5;
public class Problem5 {
 
    public static long comb(long n, long k) {
		long coeff = 1;
		for (long i = n - k + 1; i <= n; i++) {
			coeff *= i;
		}
		for (int i = 1; i <= k; i++) {
			coeff /= i;
		}
		return coeff;
	}
 
}
