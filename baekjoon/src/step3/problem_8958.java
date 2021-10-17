/*
 * @since 2021-10-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step3;

import java.util.Scanner;

public class problem_8958 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//첫번쨰 input 테스트 케이스 N개
		int N = in.nextInt();
		
		//OX를 담는 배열
		String[] ox = new String[N];
		//점수를 담는 배열
		int[] point = new int[N];
		
		for(int i=0; i<N; i++) {
			ox[i] = in.next();
		}
		
		//점수
		int sum;
		//연계점수
		int and;
		
		//테스트 케이스만큼 돔
		for(int i=0; i<N; i++) {
			sum = 0;
			and = 1;
			String str = ox[i];
			//String 을 char로 변환하고 O인경우에는 점수를 더하고 +1을하여서 연계점수를 늘림
			//틀린경우에는 연계점수를 1로 초기화
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == 'O') {
					sum += and;
					and++;
				}else if(str.charAt(j) == 'X') {
					and = 1;
				}
			}
			point[i] = sum;
		}

		//점수 확인
		for(int p : point) {
			System.out.println(p);
		}
		
		in.close();
	}
}