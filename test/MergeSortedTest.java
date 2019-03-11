package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedTest {
   MergeSorted obj;
    @Before
    public void setUp() throws Exception {
        obj = new MergeSorted();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void mergeArrays() {
         int[] arr1= {2,4,5};
        int[] arr2= {6,7,8};
        int n1=3,n2=3;
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
                if (arr1[i] < arr2[j])
                    arr3[k++] = arr1[i++];
                else
                    arr3[k++] = arr2[j++];
            }

            // Store remaining elements of first array
            while (i < n1)
                arr3[k++] = arr1[i++];

            // Store remaining elements of second array
            while (j < n2)
                arr3[k++] = arr2[j++];

        assertArrayEquals(arr3, obj.mergeArrays(arr1,arr2,n1,n2));
    }
}