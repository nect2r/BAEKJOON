/*
 * @since 2021-12-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step5;

import java.util.*;

public class problem_1193 {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int count = in.nextInt();
		
		//�Է��� ���ڿ� �´� ��ġ���ִ� �м��� ǥ���϶� ..
		//�ʹ������ ..����
		//�ϴ� �и� + ���� = T��� �Ҷ�
		//1/1 �̶�� T�� 2
		//1/2 �׸��� 2/1�� T�� 3 
		//T�� ¦���̸� ������ �Ʒ��� ��������
		//T�� Ȧ���̸� �Ʒ����� ���� �ö󰡴� �����̵ȴ�.
		//�׸��� T-1�� �ش� �밢��ĭ�� �Ѱ����̴�.
		//�׷��� count < T-1 �϶� �ش�����ȿ� ���´ٴ� �̾߱��...
		//count �� T-1��ŭ�� ���̸� �̵��ϸ� �ش��ϴ� �м��� ã�����ִµ���
		
		//1/1���� T�� 2�̱⶧�� T�� 2�� �ʱ�ȭ
		int T = 2;
		//����
		int Tsum = 0;
		
		while(true) {
			Tsum = Tsum + (T-1);
			
			//���� �ȿ����
			if(count <= Tsum) {
				//�������� ��ĭ������ ã������
				int point = Tsum-count;
				
				//¦���� �Ʒ���
				//Ȧ���� ����
				if(T % 2 == 0) {
					//¦���� ������ 1/n ���� �����ϱ�
					System.out.println((1+point) + "/" + ((T-1)-point));
				}else {
					//Ȧ���� ������ n/1 ���� �����ϱ�
					System.out.println((T-1)-point + "/" + (1+point));
				}
				
				break;
			}
			T++;
		}
	}
}