/*
 * @since 2022-12-27
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package none_step;

import java.io.*;
import java.util.*;


public class problem_14696 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());

        while(count > 0) {
            st = new StringTokenizer(br.readLine());

            int firstSize = Integer.parseInt(st.nextToken());
            int[] first = new int[4];

            for(int i = 0; i < firstSize; i++) {
                int point = Integer.parseInt(st.nextToken());

                first[point - 1]++;
            }

            st = new StringTokenizer(br.readLine());
            int secondSize = Integer.parseInt(st.nextToken());
            int[] second = new int[4];

            for(int i = 0; i < secondSize; i++) {
                int point = Integer.parseInt(st.nextToken());

                second[point - 1]++;
            }

            printSb(first, second);
            count--;
        }

        System.out.println(sb.toString());
    }

    public static void printSb(int[] a, int[] b) {
        int point = 3;

        while(point != -1) {
            if(a[point] == b[point]) {
                if(point == 0) {
                    sb.append("D\n");
                    break;
                }
            } else if(a[point] > b[point]) {
                sb.append("A\n");
                break;
            } else {
                sb.append("B\n");
                break;
            }

            point--;
        }
    }

    /*
     * 숫자로 모양을 표기한다.
     * 4 | 별 ★
     * 3 | 동그라미 ●
     * 2 | 네모 ■
     * 1 | 세모 ▲
     * 
     * 규칙
     * 1. 두 딱지의 별의 개수가 다르다면, 별이 많은 쪽 승
     * 2. 별의 개수가 같고 동그라미의 개수가 다르다면, 동그라미 많은 쪽 승
     * 3. 별,동그라미의 개수가 각각 같고 네모의 개수가 다르다면, 네모 많은 쪽 승
     * 4. 별,동그라미,네모의 개수가 각각 같고 세모의 개수가 다르다면, 세모가 많은 쪽 승
     * 5. 모두 각각의 개수가 같다면 무승부
     *
     * 풀이법 생각
     * 1. 배열을 내림차순으로 정렬해서 개수를 비교 후 결과 출력
     * 2. 배열에서 높은 모양대로 조회해서 개수를 비교 후 결과 출력
     * 
     * 방법 중 무엇이 효율적인지는 모르겠음 둘다 해보고 비교해보자..
     * 1번은 printOne / 2번은 printTwo
     * 메인 영역의 print버전만 바꾸면됨
     * 
     * 근데 정렬하다보니까 생각남..
     * 모양이 4개 뿐이라 배열 2개 for 한번이면 카운팅이 다끝나고 조건만 확인하면 되는데
     * 굳이 정렬을 해야할 이유가 없었음, 문제를 읽다가 정렬되서 나오지 않는다는 문장과 
     * 풀이를 구현하다보니 잘못된 생각에 빠진거같다.
     * printTwo에서는 배열을 숫자별로 카운팅만 하고 출력
     * 를 또 하려고하니까 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
     * 애초에 배열을 받을때부터.. 그냥 count 배열을 세고있으면 되는거였네..
     * 진짜.. 간편하게 풀생각부터 해야되는데 풀이법부터 빠져버리니 꼬였음
     * 그냥 바로 배열받으면서 카운팅 후 출력으로 변경;
     * 
     * 풀이완료
     * 간단하게 할걸 어렵게 하지말자!
     * 
     */
    public static void printOne(int[] first, int[] second) {
        leftPivotSort(first, 0, first.length - 1);
        leftPivotSort(second, 0, second.length - 1);
    }

    public static void printTwo(int[] first, int[] second) {

    }
    
    //왼쪽 피벗 퀵정렬
    public static void leftPivotSort(int[] array, int left, int right) {

        if(left >= right) {
            return;
        }

        int pivot = partition(array, left, right);

        leftPivotSort(array, left, pivot - 1);
		leftPivotSort(array, pivot + 1, right);
    }

    public static int partition(int[] array, int left, int right) {
        int varLeft = left;
        int varRight = right;
        int pivot = array[left];

        while(varLeft < varRight) {
            while(array[varRight] > pivot && varLeft < varRight) {
                varRight--;
            }

            while(array[varLeft] <= pivot && varLeft < varRight) {
                varLeft++;
            }

            swap(array, varLeft, varRight);
        }

        swap(array, left, varLeft);

        return varLeft;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
    }
}
