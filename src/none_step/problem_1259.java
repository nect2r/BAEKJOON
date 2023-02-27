/*
 * @since 2022-12-29
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package none_step;

import java.io.*;

public class problem_1259 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String value = br.readLine();

            if(value.equals("0")) 
                break;
            if(isF(value)) {
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
        }

        System.out.println(sb.toString());
    }

    public static boolean isF(String value) {
        int len = value.length();

        if(len == 1) {
            return true;
        }

        int start = 0;
        int end = value.length() - 1;

        while(true) {

            //짝수
            if(len % 2 == 0) {
                if(value.charAt(start) != value.charAt(end)) {
                    return false;
                }

                if(end - start == 1) {
                    break;
                } else {
                    start++;
                    end--;
                }
            //홀수
            } else {
                if(value.charAt(start) != value.charAt(end)) {
                    return false;
                }

                if(end == start) {
                    break;
                } else {
                    start++;
                    end--;
                }
            }
        }

        return true;
    }
}
