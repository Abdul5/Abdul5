import java.util.*;
public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 2;i < n;i++) {
			while(n % i == 0) {
				System.out.print(i+" ");
				n /= i;
			}
		}
		if(n > 2) {
			System.out.print(n);
		}

	}

}
