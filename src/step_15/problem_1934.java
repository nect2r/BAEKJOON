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

public class problem_1934 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        //최소공배수는 최대공약수를 구해서 두수의 합을 나누면 나올듯

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            sb.append(min(first, second) + "\n");
        }
    }

    //두수의 최소공배수
    public static int min(int first, int second) {
        int result = first * second;
        int max = gdc(first, second);

        return result / max;
    }

    //풀이법의 유클리드 호제법
    public static int gdc(int first, int second) {
        if(first<second) {
            int temp = first;
            first = second;
            second = temp;
        }
        while(second != 0) {
            System.out.println("r : " + first % second + " first : " + first + " second : " + second);
            
            int r = first % second;
            first = second;
            second = r;
        }
        return first;
    }

    //두수의 최대공약수
    public static int max(int first, int second) {
        int max = 1;

        if(first == second) {
            max = first;
        } else if(first > second) {
            for(int i = 1; i <= first; i++) {
                if(first % i == 0 && second % i == 0) {
                    max = i;
                } else if(second == i) {
                    break;
                }
            }
        } else {
            for(int i = 1; i <= second; i++) {
                if(second % i == 0 && first % i == 0) {
                    max = i;
                } else if(first == i) {
                    break;
                }
            }
        }

        return max;
    }
}