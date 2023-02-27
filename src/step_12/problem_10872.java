/*
 * @since 2022-11-21
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_12;

import java.util.Scanner;

public class problem_10872 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
        sc.close();

        System.out.println(Fac(N));
	}

	public static int Fac(int i) {
        if(i == 0){
            return 1;
        }

        return i * Fac(i - 1);
    }
}
