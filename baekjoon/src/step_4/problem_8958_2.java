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

public class problem_8958_2 {
	public static void main(String[] args) {
		//1�� �õ����� ����� �ѷ��ً� for���� �����ʰ� 
		//�ٴ����ڸ��� ����ϴ� ������� �ٿ���
		//������ ��� �迭�� �����
		
		Scanner in = new Scanner(System.in);
		
		//ù���� input �׽�Ʈ ���̽� N��
		int N = in.nextInt();
		
		//OX�� ��� �迭
		String[] ox = new String[N];
		
		for(int i=0; i<N; i++) {
			ox[i] = in.next();
		}
		
		//����
		int sum;
		//��������
		int and;
		
		//�׽�Ʈ ���̽���ŭ ��
		for(int i=0; i<N; i++) {
			sum = 0;
			and = 1;
			String str = ox[i];
			//String �� char�� ��ȯ�ϰ� O�ΰ�쿡�� ������ ���ϰ� +1���Ͽ��� ���������� �ø�
			//Ʋ����쿡�� ���������� 1�� �ʱ�ȭ
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == 'O') {
					sum += and;
					and++;
				}else if(str.charAt(j) == 'X') {
					and = 1;
				}
			}
			System.out.println(sum);
		}
		
		in.close();
	}
}