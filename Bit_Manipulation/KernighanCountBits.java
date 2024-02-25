package Bit_Manipulation;

//Time Complexity O(32) and OMEGA(32). BrutForce Way
public class KernighanCountBits {
    public static int countBit(int input){
        int count = 0;
        int mask = 1;
        for(int i = 0; i < 32; i++){
            int res = input & mask;
            if(res != 0){
                count++;
            }
            mask = mask << 1;
        }
        return count;
    }
    // Time Complexity O(32) and OMEGA(1) Using Kernighan's Algorithm
    public static int countBitKernighan(int input){
        int count = 0;
        while(input != 0){
            int rsb = input & (-input);
            input = input & (~rsb);
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBit(230));
        System.out.println(countBitKernighan(230));
    }
}
