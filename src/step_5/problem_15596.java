/*
 * @since 2021-10-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_5;

public class problem_15596 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];	// 1���� 10000�̹Ƿ�
		
		for(int i=1; i<10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
        
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {	// false �� �ε����� ���
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

	private static int d(int number) {
		int sum = number;
		
		while(number != 0){
			sum = sum + (number % 10); // ù ° �ڸ���
			number = number/10;	// 10�� ������ ù ° �ڸ��� ���ش�
		}
		
		return sum;
	}
}