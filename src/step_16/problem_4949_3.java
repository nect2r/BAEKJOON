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
import java.util.Stack;

public class problem_4949_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();

        while (!line.equals(".")) {
            Stack<Character> stack = new Stack<Character>();
            boolean flag = true;

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == ']') {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }

                    char prev = stack.pop();
                    if ((c == ')' && prev != '(') || (c == ']' && prev != '[')) {
                        flag = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                flag = false;
            }

            if (flag) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }

            line = br.readLine();
        }

        System.out.println(sb);
    }
}
