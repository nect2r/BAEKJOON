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

public class problem_1546_2 {
	public static void main(String[] args) {
		// 1���õ��� for���� �ι����Ƽ� 2���õ�
		Scanner in = new Scanner(System.in);
		
		//ù���� input�� ������ ���� N��
		int N = in.nextInt();
		
		//�ι��� input�� ���� ���� N�� ��ŭ
		double[] M = new double[N];
		
		//�ְ����� H
		double H = 0;
		//������ SUM
		double sum = 0;

		//������ ������ �����ϸ鼭 �ְ������� ������
		for(int i=0; i<N; i++) {
			M[i] = in.nextInt();
			
			if(M[i] > H) {
				H = M[i];
			}
			sum += M[i];
		}
		
		//���
		System.out.println(((sum/H)*100)/M.length);
		in.close();
	}
}