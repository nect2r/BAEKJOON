/*
 * @since 2023-10-19
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package none_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer count = Integer.parseInt(br.readLine());
        int[] arr = new int[31];

        // 입력배열
        for (int i = 0; i < count; i++ ) {
            int point = Integer.parseInt(br.readLine());

            arr[point]++;
        }

        // 15퍼 절사평균 갯수 구함
        long splitAvg = Math.round(count * 0.15);

        // 하위 15퍼 제거
        for (int i = 1; i < 31; i++ ) {
            if(arr[i] != 0) {
                System.out.println(i + " : " + arr[i]);

            }
        }
    }
}
