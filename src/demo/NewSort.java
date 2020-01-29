package demo;
import java.util.Arrays;
public class NewSort {
	static void insertionSortRecursive(int arr[], int n)
	{
		if (n <= 1)
			return;
	insertionSortRecursive( arr, n-1 );
	int last = arr[n-1];
		int j = n-2;
	while (j >= 0 && arr[j] > last)
		{
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = last;
	}public static void main(String[] args){
		int arr[] = {7,6,9,5};
	   insertionSortRecursive(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}

