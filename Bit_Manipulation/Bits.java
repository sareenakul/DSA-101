package Bit_Manipulation;

public class Bits {
    public static int off(int x){
        int mask = ~(1<<3);
        return(x & mask);
    }

    public static int on(int x){
        int mask = 1<<2;
        return(x | mask);
    }

    public static int toggle(int x){
        int mask = 1<<1;
        return(x ^ mask);
    }
    public static void main(String[] args) {
        int answer1 = toggle(9);
        System.out.println(answer1);
    }
}
