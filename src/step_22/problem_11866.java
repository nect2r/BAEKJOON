/*
 * @since 2022-12-29
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_22;

import java.io.*;
import java.util.*;

public class problem_11866 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int size = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<Integer>();

        for(int i = 1; i <= size; i++) {
            arr.add(i);
        }

        int point = count - 1;

        while(arr.size() != 0) {

            if(point < arr.size()) {
                int rm = arr.remove(point);

                if(arr.size() == 0) {
                    sb.append(rm);
                } else {
                    sb.append(rm + ", ");
                }
                point = point + count - 1;
            } else {
                point = point - arr.size();
            }

        }

        sb.append(">");
        System.out.println(sb.toString());
    }
}
