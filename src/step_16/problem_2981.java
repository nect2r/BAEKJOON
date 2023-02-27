/*
 * @since 2023-02-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_16;

import java.io.*;
import java.util.*;

public class problem_2981 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int[] items = new int[count];
        int minPoint = 0;
        int maxPoint = 0;

        for(int i = 0; i < count; i ++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            items[i] = n;

            if(i != 0) {
                if(items[minPoint] > n) {
                    minPoint = i;
                }

                if(items[maxPoint] < n) {
                    maxPoint = i;
                }
            } 
        }

        makeM(items,minPoint,maxPoint);
    }

    public static void makeM(int[] items, int minPoint, int maxPoint) {
        StringBuilder sb = new StringBuilder();

        for(int i = 2; i <= items[maxPoint]; i++) {
            int m = items[minPoint] % i;
            boolean b = true;

            for(int j = 0; j < items.length; j++) {    
                int temp = items[j] % i;

                if(m != temp) {
                    b = false;
                    break;
                }
            }

            if(b) {
                sb.append(i + " ");
            }
        }

        System.out.println(sb.toString());
    }
}
