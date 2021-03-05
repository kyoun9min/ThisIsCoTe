package chapter3;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int count = 0;
		
		while (true) {
			if (n < k) {
				count += (n - 1);
				break;
			}
			count += (n % k);
			n -= (n % k);
			
			n /= k;
			count++;
		}
		System.out.println(count);
	}

}
