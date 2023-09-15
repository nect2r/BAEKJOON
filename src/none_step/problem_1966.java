/*
 * @since 2021-10-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package none_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.StringTokenizer;

public class problem_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        //케이스 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            //문서의 사이즈
            int size = Integer.parseInt(st.nextToken());

            //2차원 배열 생성
            //2차 배열에 1번칸은 중요도
            //2차 배열에 2번칸은 인쇄체크여부(0,1) 1인경우 알고싶은 문서가 됨
            int[][] arr = new int[size][2];

            //인쇄순서를 알고싶은 문서의 인덱스번호
            int index = Integer.parseInt(st.nextToken());
            
            //알고싶은 문서의 배열에 1로 변경
            arr[index][1] = 1;

            //배열의 순서도 입력
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size; j++) {
                int data = Integer.parseInt(st.nextToken());
                arr[j][0] = data;
            }

            //배열정렬
            for (int j = 0; j < size; j++) {
                for (int k = size - 1; k > j; k--) {
                    if(arr[j][0] < arr[k][0]) {
                        int[] tmp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = tmp;
                        break;
                    }
                }
            }

            for (int j = 0; j < size; j++) {
                System.out.println(arr[j][0] + " : " + arr[j][1]);
            }
        }
    }
}
