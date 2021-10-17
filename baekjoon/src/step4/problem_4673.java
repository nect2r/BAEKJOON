/*
 * @since 2021-10-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step4;

public class problem_4673 {
	class Test {
		long sum(int[] a) {
			long sum = 0L;
			
			for(int i=0; i<a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
	}
}