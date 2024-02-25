package Bit_Manipulation;

public class RSBMask {
    // 2's complement creates the domino effect and when interacts with the number with & operator results the mask of RSB.
    public static int findRsbMask(int input){
        int oneComp = ~(input);
        int twoComp = oneComp + 1;
        int mask = input & twoComp;
        return mask;
    }

    // Alternate but the same only
    public static int findRsbMaskAlternate(int n){
        return(n & (-n));
    }

    public static void main(String[] args) {
        System.out.println(findRsbMask(10));
        System.out.println(findRsbMaskAlternate(10));
    }
}
