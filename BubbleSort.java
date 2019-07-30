

package sort.bubble;

public class BubbleSort {

	private static int [] bubbleArray = {23,2,10,34,4,5,45,1,26,46,78};
	
	public static void main(String [] args) {

		//Compare elements from left to right
		//If the next element is greater than current element then swap positions;
		//Continue until the last element which will push the biggest number to the last index
		//Repeat the iteration and end at last element - 1


		for(int i = (bubbleArray.length - 1); i >= 0 ; i --) { //Loop for starting the unsortedIndexPosition

			for(int j = 0; j < i ; j ++ ) { //Loop for swapping the elements

				int current = bubbleArray[j];
				//int next = bubbleArray[j+1];

				if(current > bubbleArray[j+1]) {
					bubbleArray[j] = bubbleArray[j+1];
					bubbleArray[j+1] = current;
				}
			}
		}


		for(int num: bubbleArray) {
			System.out.println(num);
		}
	}
}