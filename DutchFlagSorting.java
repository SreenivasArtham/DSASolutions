package two_pointers;

public class DutchFlagSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,0,0,1,2,1};
		for(int num : arr)System.out.println(num);
		arr = dutchNationalFlag(arr);
		for(int num : arr)System.out.println(num);
	}
	
	static int[] dutchNationalFlag(int[] arr) {
		
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while(mid<=high){
			if(arr[mid] == 0) {
				swap(arr,low,mid);
				low++;
				mid++;
			}else if(arr[mid] == 2) {
				swap(arr, high,mid);
				mid++;
				high--;
			}else {
				mid++;
			}
		}
		return arr;
	}
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	} 

}
