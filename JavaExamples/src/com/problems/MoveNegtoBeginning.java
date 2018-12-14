package com.problems;

public class MoveNegtoBeginning {

	static void rearrange(int arr[], int n) 
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++)
            {
                if (arr[i] < 0)
                   {
                     temp = arr[i];
                        arr[i] = arr[j];
                     arr[j] = temp;
                     j++;
                   }
            }
    }
     
    // A utility function to print an array
    static void printArray(int arr[], int n) 
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	
	public static int[] moveNegtoBeg(int arr[]) {
		int n = arr.length;
		/*
		int i = 0, j = 0, temp;
		while (i < n) {
			if(arr[i]<0){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			i++;
		}*/
		
		int j = 0, temp;
        for (int i = 0; i < n; i++)
            {
                if (arr[i] < 0)
                   {
                     temp = arr[i];
                        arr[i] = arr[j];
                     arr[j] = temp;
                     j++;
                   }
            }

		return arr;
	}

	public static void main(String[] args) {/*
		// 10 2 -12 5 -3 6 0

		//int arr[] = { 10, 2, -12, 5, -3, 6, 0 };
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9 };
		
		moveNegtoBeg(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]+" ");
		}
	*/
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
     
        rearrange(arr, n);
        printArray(arr, n);	
	}

}
