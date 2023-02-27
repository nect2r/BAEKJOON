/*
 * @since 2023-01-02
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

public class problem_1620 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //포켓몬의 개수
        int N = Integer.parseInt(st.nextToken());

        //맞춰야 하는 문제의 개수
        int M = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        for(int i = 0; i < N; i++) {
            String str = br.readLine();

            map.put(str, i + 1);
            map2.put(String.valueOf(i + 1), str);
        }

        for(int i = 0; i < M; i++) {
            String str = br.readLine();

            if(map.containsKey(str)) {
                System.out.println(map.get(str));
            }

            if(map2.containsKey(str)) {
                System.out.println(map2.get(str));
            }
        }
    }
}
