package Bit_Manipulation;
public class Bits {
    // Turns off the 3rd bit
    public static int off(int x){
        int mask = ~(1<<3);
        return(x & mask);
    }
    // Turns on the 2nd bit
    public static int on(int x){
        int mask = 1<<2;
        return(x | mask);
    }
    // Toggles the 1st bit
    public static int toggle(int x){
        int mask = 1<<1;
        return(x ^ mask);
    }
    public static void main(String[] args) {
        int answer1 = off(9);
        int answer2 = on(9);
        int answer3 = toggle(9);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }
}