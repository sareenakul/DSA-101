package BinarySearch;

public class FindPeak {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(end >= start){
            mid = (end - start)/2 + start;
            if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] < arr[mid+1]){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        return -1;
    }
}

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
