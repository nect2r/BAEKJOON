package algorithm.sort;

/**
 * https://st-lab.tistory.com/104
 */
public class countingSort {
	public static void main(String[] args){

		int[] array = {
			7,2,3,5,7,1,4,6,7,5,0,1
		};

		int[] counting = new int[8];
		int[] arraySort = new int[array.length];

		//카운팅
		for(int i=0; i<array.length; i++) {
			counting[array[i]]++;
		}

		//카운팅 표출
		for(int i=0; i<counting.length; i++) {
			System.out.print(" " + counting[i]);
		}

		System.out.println();

		//누적합
		for(int i=1; i<counting.length; i++) {
			counting[i] += counting[i-1];
		}

		//누적합 후 표출
		for(int i=0; i<counting.length; i++) {
			System.out.print(" " + counting[i]);
		}

		System.out.println();

		//누적합 후 정렬
		for(int i=array.length-1; i>=0; i--) {
			int value = array[i];
			counting[value]--;
			arraySort[counting[value]] = value;
		}

		//누적합 후 정렬 후 표출
		for(int i=0; i<arraySort.length; i++) {
			System.out.print(" " + arraySort[i]);
		}
	}
}