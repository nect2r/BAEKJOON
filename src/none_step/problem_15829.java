/*
 * @since 2021-10-17
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

public class problem_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        long sum = 0;

        for(int i = 0; i < L; i ++) {
            int a = str.charAt(i) - 96;

            sum = sum + makePow(a, i);
        }

        System.out.println(sum);
    }

    static final int M = 1234567891;
    //제곱의 범위가 long을 벗어남으로 pow함수 생성
    public static long makePow(int a, int y) {
        long result = a % M;



        return 0 ;
    }

}
