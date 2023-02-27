/*
 * @since 2021-12-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package none_step;

import java.io.IOException;
import java.util.Scanner;

public class problem_4948 {
	static boolean[] isPrime = new boolean[123456 * 2 + 1];
	
	public static void main(String[] args) throws IOException {
		make_Prime();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int N = Integer.parseInt(sc.next());
			if(N == 0) {
				break;
			} else {
				int count = 0;
				
				for(int i = N+1; i <= N * 2; i++) {
					if(!isPrime[i]) count++;
				}
				System.out.println(count);
			}
		}
		sc.close();
	}

	static void make_Prime() {
		isPrime[0] = isPrime[1] = true;
		
		for(int i = 2; i < Math.sqrt(isPrime.length); i ++) {
			if(isPrime[i]) continue;
			for(int j = i * i; j < isPrime.length; j += i) {
				isPrime[j] = true;
			}
		}
	}
}
