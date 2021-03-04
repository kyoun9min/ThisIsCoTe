//package chapter3;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.StringTokenizer;
//
//public class Ex2 {
//
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
//		int n = Integer.parseInt(tokenizer.nextToken());
//		int m = Integer.parseInt(tokenizer.nextToken());
//		int k = Integer.parseInt(tokenizer.nextToken());
//		Integer[] arr = new Integer[n]; // int 형은 역순정렬 안됨. 래퍼클래스(객체)형으로 선언 및 생성.
//		StringTokenizer ArrToken = new StringTokenizer(reader.readLine());
//		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(ArrToken.nextToken());
//		}
//		Arrays.sort(arr, Collections.reverseOrder());
//		int max1 = arr[0];
//		int max2 = arr[1];
//		int cnt = 0;
//		int answer = 0;
//		for (int i = 0; i < m; i++) {
//			if (cnt == k) {
//				answer += max2;
//				cnt = 0;
//				continue;
//			}
//			answer += max1;
//			cnt++;
//		}
//		
//		System.out.println(answer);
//	}
//
//}

package chapter3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		int max1 = arr[n - 1];
		int max2 = arr[n - 2];
		
		int max1AddCnt = m / (k + 1) * k;
		max1AddCnt += m % (k + 1);
		
		int answer = 0;
		answer = max1 * max1AddCnt + max2 * (m - max1AddCnt);
		System.out.println(answer);
	}

}
