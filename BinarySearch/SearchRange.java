package BinarySearch;

public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = firstOccurance(nums, target);
        result[1] = lastOccurance(nums, target);
        return result;
    }
    public static int firstOccurance(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int index = -1;
        while(end >= start){
            mid = (end - start)/2 + start;
            if(nums[mid] == target){
                index = mid;
                end = mid - 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return index;
    }

    public static int lastOccurance(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int index = -1;
        while(end >= start){
            mid = (end - start)/2 + start;
            if(nums[mid] == target){
                index = mid;
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] list = {1,1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,4,4,5,5,6,6,7};
        int target = 1;
        int[] result = searchRange(list, target);
        for(int num : result){
            System.out.println(num);
        }
    }
}

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
