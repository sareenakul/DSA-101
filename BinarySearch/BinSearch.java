package BinarySearch;
public class BinSearch {
    // Normal Binary Search with Time Complexity O(log(n)) and Space Complexity of O(1)
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while(end >= start){
            mid = (end - start)/2 + start;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    // Normal Binary Search with Time Complexity O(2log(n)) and Space Complexity O(log(n))
    public static int recursiveBS(int[] nums, int target, int start, int end){
        if(end >= start){
           int mid = (end - start)/2 + start;
        
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                return recursiveBS(nums, target, start, mid - 1);
            }
            else if(nums[mid] < target){
                return recursiveBS(nums, target, mid + 1, end);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int target = 6;
        int index1 = search(list, target);
        int index2 = recursiveBS(list, target, 0, list.length - 1);
        System.out.println(index1);
        System.out.println(index2);
    }
}

// https://leetcode.com/problems/binary-search/