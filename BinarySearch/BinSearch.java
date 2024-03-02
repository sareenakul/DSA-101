package BinarySearch;
public class BinSearch {
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

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int target = 6;
        int index = search(list, target);
        System.out.println(index);
    }
}
