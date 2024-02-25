package Bit_Manipulation;

public class CheckBit {
    //Checks if the the bit is on or off by using & operator along with 1
    public static boolean bitCheck(int number, int index){
        int mask = 1<<index;
        int result = mask & number;
        if(result == 0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        if(bitCheck(9, 7)){
            System.out.println("the bit is ON");
        }
        else{
            System.out.println("Bit is off");
        }
    }
    
}
