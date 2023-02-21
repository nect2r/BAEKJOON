/*
 * @since 2023-02-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_15;

import java.io.*;
import java.util.*;

public class problem_1037 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken());

            if(max < value) {
                max = value;
            }

            if(min > value) {
                min = value;
            }
        }

        System.out.println(max * min);
    }
}