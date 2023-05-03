package step_10;

import java.io.*;
import java.util.*;

public class problem_15894 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        System.out.println(4 * n);
    }
}
