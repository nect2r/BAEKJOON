/*
 * @since 2022-11-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_4;

import java.util.*;

public class problem_5597 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>(
			Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
		);

		for(int i=0; i<28; i++) {
			Integer a = sc.nextInt();
			list.remove(a);
		}

		if(list.get(0) > list.get(1)) {
			System.out.println(list.get(1));
			System.out.println(list.get(0));
		}else{
			System.out.println(list.get(0));
			System.out.println(list.get(1));
		}
		sc.close();
	}
}