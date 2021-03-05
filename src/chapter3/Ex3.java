//package chapter3;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Ex3 {
//
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
//		int row = Integer.parseInt(tokenizer1.nextToken());
//		int col = Integer.parseInt(tokenizer1.nextToken());
//		int[][] arr1 = new int[row][col];
//		
//		for (int i = 0; i < row; i++) {
//			StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
//			for (int j = 0; j < col; j++) {
//				arr1[i][j] = Integer.parseInt(tokenizer2.nextToken());
//			}
//		}
//		
//		int[] arr2 = new int[row];
//		
//		for (int i = 0; i < row; i ++) {
//			Arrays.sort(arr1[i]);
//			arr2[i] = arr1[i][0];
//		}
//		Arrays.sort(arr2);
//		System.out.println(arr2[row - 1]);
//	}
//
//}

//package chapter3;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Ex3 {
//	
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
//		int n = Integer.parseInt(tokenizer1.nextToken());
//		int m = Integer.parseInt(tokenizer1.nextToken());
//		int result = 0;
//		
//		for (int i = 0; i < n; i++) {
//			StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
//			int[] arr = new int[m];
//			for (int j = 0; j < m; j++) {
//				arr[j] = Integer.parseInt(tokenizer2.nextToken());
//			}
//			Arrays.sort(arr);
//			result = Math.max(result, arr[0]);
//		}
//		
//		System.out.println(result);
//	}
//}

package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokenizer1.nextToken());
		int m = Integer.parseInt(tokenizer1.nextToken());
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer tokenizer2 = new StringTokenizer(br.readLine());
			int minValue = 10001;
			for (int k = 0; k < m; k++) {
				int x = Integer.parseInt(tokenizer2.nextToken());
				minValue = Math.min(minValue, x);
			}
			result = Math.max(result, minValue);
		}
		System.out.println(result);
	}
}