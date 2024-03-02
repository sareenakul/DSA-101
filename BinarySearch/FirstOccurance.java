package BinarySearch;

public class FirstOccurance {
    // Finds the firstOccurance of a target
    public static int findFirst(int target, int[] nums){
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

    public static void main(String[] args) {
        int[] list = {1,1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,4,4,5,5,6,6,7};
        int target = 1;
        int result = findFirst(target, list);
        System.out.println(result);
    }
}
