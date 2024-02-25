package Bit_Manipulation;

// Return the mask that finds the right most significant Bit. 
// Initiating the mask from 1 and then keep shifting left until the & operator does not give a 1.
public class RightMostSignificantBitMask {
    public static int returnMask(int input){
        int mask = 1;
        for(int i = 0; i < 31; i++){
            int res = mask & input;
            if(res == 0){
                mask = mask<<1;
            }
            if(res != 0){
                return mask;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int output = returnMask(10);
        System.out.println(output);
    }
}
