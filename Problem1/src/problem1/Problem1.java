package problem1;

public class Problem1 {
	public static void main(String[] args) {
        // Your code here
		check(gcd(5, 1), 1);
		check(gcd(234, 234), 234);
		check(gcd(18, 16), 6);
		check(gcd(16, 18), 6);
		check(gcd(36, 24), 12);
		check(gcd(24, 36), 12);
		check(gcd(77, 21), 7);
		check(gcd(104513, 23), 1);
	}

	public static void check(int input,int expectedOutput){
		System.out.println("Input: " + input + "|| Output: " + expectedOutput);
		if( input == expectedOutput ){
			System.out.println("The output is correct\n");
		}else{
			System.out.println("Incorrect output\n");
		}
	}

	public static int gcd(int p, int q) {
		if (q == 0) {
			return p;
		}
		return gcd(q, p % q);
	}
        
}
