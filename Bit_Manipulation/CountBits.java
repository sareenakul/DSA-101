package Bit_Manipulation;
public class CountBits {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0; i <= n; i++){
            result[i] = findCount(i);
        }
        return result;
    }
    public int findCount(int x){
        int count = 0;
        while(x != 0){
            int rsb = x & (-x);
            x = x & (~rsb);
            count = count + 1;
        }
        return count;
    }
    // https://leetcode.com/problems/counting-bits/
}