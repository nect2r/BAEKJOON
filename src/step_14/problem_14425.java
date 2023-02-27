/*
 * @since 2022-11-22
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_14;

import java.io.*;
import java.util.*;

public class problem_14425 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        Map<String,Boolean> map = new HashMap<>();

        for(int i=0; i<N; i++) {
            map.put(br.readLine(), false);
        }

        for(int i=0; i<M; i++) {
            if(map.containsKey(br.readLine())) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
