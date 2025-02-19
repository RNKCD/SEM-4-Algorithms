import java.util.Arrays;
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {1,3,7,5,9};
		System.out.println(Arrays.toString(arr));
			
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	
		}
  
	static void insertionSort(int[] arr){
		int n = arr.length;
		for(int i = 1 ; i < n ; i++){
			int element = arr[i];
			int j ;

			// Shifting all the bigger element to right so there is empty spot at j
			for( j = i -1;  j>= 0 && element < arr[j]; j--){
				arr[j+1] = arr[j];
				arr[j] = element;
				System.out.println(Arrays.toString(arr));
			}

			//While Method is more clear
			// int j = i-1;
			// while (j >= 0 && arr[j] > element) {
            //     arr[j + 1] = arr[j];
            //     j--;
            // }

			//Putting the value at j( Needed to do j+1 due to j--)
			

			
		}
		
	}
}
		




