/*
 * @since 2022-11-21
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_12;

import java.io.*;
import java.util.*;

public class problem_2447 {

    static char[][] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        arr = new char[N][N];
        print(0, 0, N, false);
    }

    public static void print(int x, int y, int N, boolean chk) {
        if(N == 1) return;


    }
}
