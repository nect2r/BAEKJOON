/*
 * @since 2022-11-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_3;

import java.io.*;

public class problem_25304 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int itemCount = Integer.parseInt(br.readLine());
        int realTotal = 0;
        
        for(int i=0; i<itemCount; i++) {
            String[] strs = br.readLine().split(" ");
            String item = strs[0];
            String cnt = strs[1];

            realTotal += Integer.parseInt(item) * Integer.parseInt(cnt);
        }

        if(total == realTotal) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}