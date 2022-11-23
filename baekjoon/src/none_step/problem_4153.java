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

public class problem_4153 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        while(true) { 
            st = new StringTokenizer(br.readLine());

            int[] arr = new int[3];

            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);

            if(arr[0] + arr[1] + arr[2] == 0) {
                break;
            }else{
                if((Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) == Math.pow(arr[2], 2)) {
                    sb.append("right\n");
                }else{
                    sb.append("wrong\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}