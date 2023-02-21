/*
 * @since 2021-12-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_8;

import java.io.IOException;
import java.util.Scanner;

public class problem_1929 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int M = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		sc.close();
		int i;
		boolean arr[] = new boolean[N+1];
		arr[0] = arr[1] = true;
        
		int sqrt = (int) Math.sqrt(N);
		for(i=2; i<=sqrt; i++) {

			for(int j=2; j<=N/i; j++) {
					if(arr[i*j] == true) {
						continue;
					}
					else  {
						arr[i*j] = true;
					}
			}	
		}

		for(i=M; i<=N; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
	}
}