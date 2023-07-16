package maxSubArr;

import java.util.Scanner;

public class MaxSubArry {
	public static int maxi(int arr[], int a, int b)
	{
		int max = 0;
		for(int i = 0; i<a; i++) {
			int sum = 0;
			for(int j = i; j<a; j++) {
				sum += arr[j];
				if(sum <= b && sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0; i < a; i++);
		arr[a] = sc.nextInt();
	}
}