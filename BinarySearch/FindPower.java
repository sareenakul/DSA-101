package BinarySearch;

class FindPower {
    // Brutforce Way
    public static double myPow(double x, int n) {
        double ans = 1;
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return myPow(1/x, -n);
        }
        for(int i = 0; i < n; i++){
            ans = ans * x;
        }
        return ans;
    }

    public static double recursiveExonentiationMyPow(double x, int n) {
        long num = n;
        if(num == 0){
            return 1.0;
        }
        if(num < 0){
            if(num == -2147483648){
                return((1/x) * (1/recursiveExonentiationMyPow(x, 2147483647)));
            }
            return(recursiveExonentiationMyPow(1/x, -n));
        }
        if(n%2 == 0){
            return(recursiveExonentiationMyPow(x*x,n/2));
        }
        return(x * recursiveExonentiationMyPow(x, n-1));
    }

    public static void main(String[] args) {
        double output = recursiveExonentiationMyPow(10, 4);
        System.out.println(output);
    }
}

// https://leetcode.com/problems/powx-n/