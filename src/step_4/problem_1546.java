/*
 * @since 2021-10-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_4;

import java.util.Scanner;

public class problem_1546 {
	public static void main(String[] args) {
		// 1차시도는 for문이 두번돌아서 2차시도
		Scanner in = new Scanner(System.in);
		
		//첫번쨰 input은 과목의 갯수 N개
		int N = in.nextInt();
		
		//두번쨰 input은 과목 성적 N개 만큼
		double[] M = new double[N];
		
		//최고점수 H
		double H = 0;
		//총점수 SUM
		double sum = 0;

		//과목의 점수를 저장하면서 최고점수도 갱신함
		for(int i=0; i<N; i++) {
			M[i] = in.nextInt();
			
			if(M[i] > H) {
				H = M[i];
			}
			sum += M[i];
		}
		
		//결과
		System.out.println(((sum/H)*100)/M.length);
		in.close();
	}
}