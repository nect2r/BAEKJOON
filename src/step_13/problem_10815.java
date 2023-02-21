/*
 * @since 2023-01-01
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_13;

import java.io.*;
import java.util.*;

public class problem_10815 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nCount = Integer.parseInt(br.readLine());
        Map<Integer,Integer> hash = new HashMap<Integer,Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < nCount; i++) {
            hash.put(Integer.parseInt(st.nextToken()), 1);
        }

        int mCount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < mCount; i++) {
            if(hash.containsKey(Integer.parseInt(st.nextToken()))) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}