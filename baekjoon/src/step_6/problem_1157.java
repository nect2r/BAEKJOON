/*
 * @since 2021-10-19
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_6;

import java.util.Scanner;

public class problem_1157 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int[] arr = new int[26]; // �������� ������ 26���� ������ ����..��
		String s = in.next();
 
		for (int i = 0; i < s.length(); i++){
 
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // �빮�� ����
				arr[s.charAt(i) - 'A']++;	// �ش� �ε����� �� 1 ����
			}
    
			else {	// �ҹ��� ����
				arr[s.charAt(i) - 'a']++;
			}
		}
 
 
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // �빮�ڷ� ����ؾ��ϹǷ� 65�� �����ش�.
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
 
		System.out.print(ch);
		in.close();
	}
}