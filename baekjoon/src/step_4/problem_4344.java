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

public class problem_4344 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//�׽�Ʈ ���̽� N��
		int N = in.nextInt();
		
		for(int i=0; i<N; i++) {
			//�ο��� 
			int people = in.nextInt();
			
			//���� �迭
			int[] point = new int[people];
			
			//������
			int sum = 0;
			double count = 0;
			
			for(int j=0; j<people; j++) {
				point[j] = in.nextInt();
				sum += point[j];
			}
			
			for(int j=0; j<people; j++) {
				if(sum/people < point[j]) {
					count++;
				}
			}
			
			System.out.println(String.format("%.3f", (count/people)*100) + "%");
		}
		in.close();
	}
}