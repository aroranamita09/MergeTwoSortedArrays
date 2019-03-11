package com.stackroute;
public class MergeSorted {
    int[] mergeArrays(int arr1[], int arr2[], int n1,
                     int n2)
    {
        int i = 0, j = 0, k = 0;
        int n3=n1+n2;
        int arr3[]=new int[n3];
        // Traverse both array
        while (i<n1 && j <n2)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
           /*your code here*/
        }

        // Store remaining elements of first array
        while (i < n1)
            /*your code here*/

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
        return arr3;
    }
}
