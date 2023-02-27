/*
 * @since 2022-12-30
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_13;

import java.io.*;

public class problem_1436 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int check = 1;
        int point = 666;

        while(true) {
            if(count == check) {
                System.out.println(point);
                break;
            } else {
                point++;
                String str = String.valueOf(point);

                if(str.contains("666")) {
                    check++;
                }
            }
        }
    }
}
