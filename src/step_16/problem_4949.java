/*
 * @since 2023-09-08
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String regExp = "[^(-)\\[-\\]]";
        String regExp2 = "(\\(\\))|(\\[\\])";
        String str = br.readLine();

        while (!str.equals(".")) {
            String data = str.replaceAll(regExp, "");

            if (data.length() % 2 == 0) {
                String prev = data.replaceAll(regExp2, "");

                while (true) {
                    if (prev.isEmpty()) {
                        sb.append("yes").append("\n");
                        break;
                    }

                    if (prev.equals(prev.replaceAll(regExp2, ""))) {
                        sb.append("no").append("\n");
                        break;
                    } else {
                        prev = prev.replaceAll(regExp2, "");
                    }
                }
            } else {
                sb.append("no").append("\n");
            }

            str = br.readLine();
        }

        System.out.println(sb);
    }
}
