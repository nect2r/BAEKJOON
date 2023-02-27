/*
 * @since 2021-12-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_9;

import java.io.IOException;
import java.util.Scanner;

public class problem_9020 {
	static boolean[] isPrime = new boolean[20001];
	
	public static void main(String[] args) throws IOException {
		make_Prime();
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		while(T-- > 0) {
			int N = sc.nextInt();
			
			int T1 = N / 2;
			int T2 = N / 2;
			
			while(true) {
				if(!isPrime[T1] && !isPrime[T2]) {
					System.out.print(T1);
					System.out.print(" ");
					System.out.print(T2 + "\n");
					break;
				} else {
					T1 = T1 - 1;
					T2 = T2 + 1;
				}
			}
		}
		sc.close();
	}

	static void make_Prime() {
		isPrime[0] = isPrime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(isPrime.length); i ++) {
			if(isPrime[i]) continue;
			for(int j = i * i; j < isPrime.length; j += i) {
				isPrime[j] = true;
			}
		}
	}
}
