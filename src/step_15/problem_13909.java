/*
 * @since 2023-09-06
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem_13909 {

    static boolean[] windows;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int data = Integer.parseInt(st.nextToken());
        int count = 0;
        int point = 1;

        for (int i = 0; i < data; i = i + point) {
            count++;
            point += 2;
        }

        System.out.println(count);

        //50회 시뮬레이션
        /*for(int i = 1; i <= 50; i++) {
            boolean[] test = new boolean[i + 1];


            for(int j = 1; j < test.length; j++) {
                for(int k = j; k < test.length; k = k + j) {
                    test[k] = !test[k];
                }
            }

            sb.append(i).append(" | ");
            for(int j = 1; j < test.length; j++) {
                if(test[j]) {
                    sb.append(1).append(" ");
                } else {
                    sb.append(0).append(" ");
                }
            }
            sb.append("\n");
        }*/
    }

    /*
    1 | 1
    2 | 1 0
    3 | 1 0 0
    4 | 1 0 0 1
    5 | 1 0 0 1 0
    6 | 1 0 0 1 0 0
    7 | 1 0 0 1 0 0 0
    8 | 1 0 0 1 0 0 0 0
    9 | 1 0 0 1 0 0 0 0 1
   10 | 1 0 0 1 0 0 0 0 1 1
   11 | 1 0 0 1 0 0 0 0 1 1 0
   12 | 1 0 0 1 0 0 0 0 1 1 0 0
   13 | 1 0 0 1 0 0 0 0 1 1 0 0 0
   14 | 1 0 0 1 0 0 0 0 1 1 0 0 0 0
   15 | 1 0 0 1 0 0 0 0 1 1 0 0 0 0 0
   16 | 1 0 0 1 0 0 0 0 1 1 0 0 0 0 0 1

     */
}
