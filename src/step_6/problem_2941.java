/*
 * @since 2021-11-23
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_6;

import java.util.*;

public class problem_2941 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		int len = str.length();
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			 
			if(ch == 'c' && i < len - 1) {			
				if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {		
					i++;		
				}
				
			}
		    
			else if(ch == 'd' && i < len - 1) {
				if(str.charAt(i + 1) == '-') {
						i++;
					}
				else if(str.charAt(i + 1) == 'z' && i < len - 2) {
					
					if(str.charAt(i + 2) == '=') {
						i += 2;
					}
				}
			}
		    
			else if((ch == 'l' || ch == 'n') && i < len - 1) {
				if(str.charAt(i + 1) == 'j') {	
					i++;
				}
			}
		    
 
			else if((ch == 's' || ch == 'z') && i < len - 1) {
				if(str.charAt(i + 1) == '=') {
					i++;
				}
			
		    }
		    
			count++;
			
		}
		
		System.out.println(count);
		
		in.close();
	}
}