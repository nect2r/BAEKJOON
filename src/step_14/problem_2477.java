/*
 * @since 2022-11-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_14;

import java.io.*;
import java.util.*;

public class problem_2477 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int count = Integer.parseInt(br.readLine());
        
        int[] ver = new int[3];
        int[] hor = new int[3];
        int vc = 0;
        int hc = 0;
        int verMax = 0;
        int horMax = 0;
        int verMaxPoint = 0;
        int horMaxPoint = 0;

        //방향이 같은 2개가 나올떄 세로는 2번째, 가로는 1번째를 곱하면 제외할 영역을 알수있음
        //전체에서 빼고 구하면 되겠다.. 야호
        for(int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());

            int direction = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());

            //세로
            if(direction == 3 || direction == 4) {
                ver[vc] = length;

                if(verMax < length) {
                    verMax = length;
                    verMaxPoint = vc;
                }

                vc++;
            //가로
            } else {
                hor[hc] = length;
                
                if(horMax < length) {
                    horMax = length;
                    horMaxPoint = hc;
                }

                hc++;
            }
        }

        System.out.println(verMaxPoint);
        System.out.println(horMaxPoint);
    }
}