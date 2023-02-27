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
import java.math.BigInteger;

public class problem_10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());

        A = A.add(B);

        System.out.println(A);
		sc.close();
	}
}
