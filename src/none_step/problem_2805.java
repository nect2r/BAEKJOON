/*
 * @since 2023-10-23
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
import java.util.StringTokenizer;

public class problem_2805 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int MAX_VALUE = Integer.MIN_VALUE;

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());

            if (MAX_VALUE < trees[i]) {
                MAX_VALUE = trees[i];
            }
        }

        int start = 1;
        int end = MAX_VALUE;

        while(start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;

            System.out.println(start + ", " + mid + ", " + end);

            for (int i = 0; i < trees.length; i++) {
                if (trees[i] >= mid) {
                    sum += trees[i] - mid;
                }
            }

            System.out.println(sum);
            System.out.println(M);

            if (sum >= M) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
}
