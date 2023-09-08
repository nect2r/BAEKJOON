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
import java.util.ArrayDeque;
import java.util.Deque;

public class problem_4949_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        Deque<Character> words = new ArrayDeque<>();

        while (!line.equals(".")) {
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (c == '(') {
                    words.push(c);
                }

                if (c == '[') {
                    words.push(c);
                }

                if (c == ')') {
                    if (words.isEmpty()) {
                        words.push('a');
                        break;
                    } else if (words.peek() != '(') {
                        break;
                    } else {
                        words.pop();
                    }
                }

                if (c == ']') {
                    if (words.isEmpty()) {
                        words.push('a');
                        break;
                    } else if (words.peek() != '[') {
                        break;
                    } else {
                        words.pop();
                    }
                }
            }

            if (words.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }

            line = br.readLine();
            words = new ArrayDeque<>();
        }


        System.out.println(sb);
    }
}
