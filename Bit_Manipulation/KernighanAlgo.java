package Bit_Manipulation;

public class KernighanAlgo {
    // 2's complement creates the domino effect and when interacts with the number with & operator results the mask of RSV.
    public static int findRsvMask(int input){
        int oneComp = ~(input);
        int twoComp = oneComp + 1;
        int mask = input & twoComp;
        return mask;
    }

    // Alternate but the same only
    public static int findRsvMaskAlternate(int n){
        return(n & (-n));
    }

    public static void main(String[] args) {
        System.out.println(findRsvMask(10));
        System.out.println(findRsvMaskAlternate(10));
    }
}