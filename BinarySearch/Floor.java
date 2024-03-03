package BinarySearch;

public class Floor {
    static int findFloor(long arr[], int n, long x) {
        int start = 0;
        int end = n - 1;
        int mid = 0;
        int index = -1;
        while(end >= start){
            mid = (end - start)/2 + start;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                index = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return index;
    }
}

// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
