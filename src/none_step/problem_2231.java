/*
 * @since 2022-11-22
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package none_step;

import java.io.*;
import java.util.*;

public class problem_2231 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=N; i>0; i--) {
            int size = String.valueOf(N).length();
            int tmp = i;
            int sum = 0;

            sb.setLength(0);
            for(int j=0; j<size; j++) {
                sb.append(tmp % 10);
                sum += tmp % 10;
                tmp = tmp / 10;
            }

            sb.reverse();
            int value = Integer.parseInt(sb.toString());
            if((sum + value) == N) {
                if(answer > i || answer == 0) {
                    answer = i;
                }
            }
        }

        System.out.println(answer);
    }
}
