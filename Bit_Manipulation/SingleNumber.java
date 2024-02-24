package Bit_Manipulation;

public class SingleNumber {
    // Initiate the xor as 0 and then the xor helps eleminate the pairs by cancelling them and then the xor adapts single number.
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor = nums[i] ^ xor;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,5,4,2,1};
        int loner = singleNumber(list);
        System.out.println(loner);
    }
}
// https://leetcode.com/problems/single-number/description/
