/*
 * @since 2022-11-17
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

public class problem_1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int answer = 0;
        int minX = 0;
        int minY = 0;

        if(x < w - x) {
            minX = x;
        }else{
            minX = w - x ;
        }

        if(y < h - y) {
            minY = y;
        }else{
            minY = h - y ;
        }

        if(minX > minY) {
            answer = minY;
        }else{
            answer = minX;
        }

        System.out.println(answer);
    }
}