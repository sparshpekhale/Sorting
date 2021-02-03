
public class NewBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,3,7,5,6,9};
		newBubbleSort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void newBubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
}
