/*
 * @since 2022-11-22
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_12;

import java.io.*;
import java.util.*;

public class problem_1018 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];

        for(int i=0; i<N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        //개수 찾기
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                
            }
        }
    }


    //현재 좌표의 맞닿아있는 네변 방향에 좌표가 있는 값만 해야함
    //좌표가 최상단 왼쪽 구석이면 오른쪽,아래만 있음 || 좌표가 최상단 오른쪽 구석이면 왼쪽,아래만 있음 
    //내용처럼 일단 확인부터해야함                
    //i가 0에 해당하면 위X | i가 마지막에 해당하면 아래X
    //j가 0에 해당하면 왼쪽x | j가 마지막에 해당하면 오른쪽x 
    public static char cirCoor(char[][] arr, int x, int y) {


        return 0;
    }
}