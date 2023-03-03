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

    /* 

        *********
        * ** ** *
        *********
        ***   ***
        * *   * *
        ***   ***
        *********
        * ** ** *
        *********

    */

    static char[][] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        arr = new char[N][N];

        make(0, 0, N, false);

        for(char[] c : arr) {
            for(char cs : c) {
                System.out.print(cs);
            }
            System.out.println();
        }
    }

    public static void make(int x, int y, int N, boolean isBlack) {

        //공백여부
        if(isBlack) {
            
        }

    }
}
