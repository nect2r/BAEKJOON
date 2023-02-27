/*
 * @since 2021-12-23
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_8;

import java.util.Scanner;

public class problem_2775 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] APT = new int[15][15];

		for(int i = 0; i< 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}

		for(int i = 1; i< 15; i++) {
			for(int j = 2; j< 15; j++) {
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}

		int T = sc.nextInt();

		for(int i = 0; i< T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(APT[k][n]);
		}
	}
}
