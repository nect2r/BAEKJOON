/*
 * @since 2021-10-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_15552 {
    public static void main(String[] args) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����
    	
    	try {
    		
    		Integer T = Integer.parseInt(bf.readLine());
    		
    		if(T <= 1000000) {
    			for(int i=0; i<T; i++) {
    				String str = bf.readLine();
    				Integer A = Integer.parseInt(String.valueOf(str.subSequence(0, str.indexOf(" "))));
    				Integer B = Integer.parseInt(String.valueOf(str.subSequence(str.indexOf(" ")+1, str.length())));
    				
    				if((1 <= A && A <= 1000) && (1 <= B && B <= 1000)) {
    					Integer sum = A + B;
    					bw.write(String.valueOf(sum));
    					bw.newLine();
    				}
    			}
    		}else {
    			System.out.println("T�� �ִ� 1,000,000 �Դϴ�.");
    		}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bw.flush();
			
			bf.close();
			bw.close();
		}
    }
}