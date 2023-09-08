/*
 * @since 2023-09-04
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

public class problem_17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(st.nextToken());

        for(int i = 0; i < count; i ++) {
            st = new StringTokenizer(br.readLine());
            int data = Integer.parseInt(st.nextToken());

            sb.append(getAddCount(data, makePrimeArray(data))).append("\n");
        }

        System.out.println(sb.toString());
    }

    //2보다 큰 짝수까지의 소수 배열
    public static boolean[] makePrimeArray(int even) {
        boolean[] prime = new boolean[even + 1];

        prime[0] = prime[1] = true;

        //소수 정리
        for(int i = 2; i < Math.sqrt(even); i++) {
            if(prime[i]) {
                continue;
            }

            for(int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }

        return prime;
    }

    //2보다 큰 짝수의 합이되는 두 소수의 경우 카운팅
    public static int getAddCount(int limit, boolean[] prime) {
        int count = 0;

        for(int i = 2; i < prime.length / 2 + 1; i++) {
            if(!prime[i] && !prime[limit - i]) {
                count++;
            }
        }

        return count;
    }
}
