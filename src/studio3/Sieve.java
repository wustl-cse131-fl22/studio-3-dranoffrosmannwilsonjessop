package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the value of N?");
		int N = scan.nextInt();
		int[] numberList = new int[N];
		for (int i = 0; i < numberList.length - 1; i++){
			numberList[i] = i + 2;
		}
		int u = 0;
		for (int j = 2; j<Math.sqrt(N); j++) {
			if (numberList[u] % j == 0 && numberList[u] != j){
				numberList[u] = 0;
		}
			u += 1;
			System.out.print(numberList[u] + " ");
		}
			/*
			if (numberList[i] % 2 == 0 && numberList[i] != 2) {
				numberList[i] = 0;
			}
			if (numberList[i] % 3 == 0 && numberList[i] != 3) {
				numberList[i] = 0;
			}
			if (numberList[i] % 5 == 0 && numberList[i] != 5) {
				numberList[i] = 0;
			}
			if (numberList[i] % 7 == 0 && numberList[i] != 7) {
				numberList[i] = 0;
			}
			if (numberList[i] % 11 == 0 && numberList[i] != 11) {
				numberList[i] = 0;
			}
			if (numberList[i] % 13 == 0 && numberList[i] != 13) {
				numberList[i] = 0;
			}
			if (numberList[i] % 17 == 0 && numberList[i] != 17) {
				numberList[i] = 0;
			}
			if (numberList[i] % 19 == 0 && numberList[i] != 19) {
				numberList[i] = 0;
			}
			if (numberList[i] % 23 == 0 && numberList[i] != 23) {
				numberList[i] = 0;
			}
			if (numberList[i] % 29 == 0 && numberList[i] != 29) {
				numberList[i] = 0;
			}
			*/
	
	for (int k = 0; k < numberList.length -1; k++) {
			if (numberList[k]!= 0) {
				//System.out.print(numberList[k] + " ");
				
			}
			
		}

	}

}
