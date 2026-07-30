class Solution {
    public double myPow(double x, int n) {

        long power = n;

        if(power < 0){
            x = 1/x;
            power = -power; // Make exponent positive
        }

        double result = 1.0;

        while(power > 0){

             // If exponent is odd,
            // one copy of current x cannot be paired,
            // so include it in the answer.

            if((power & 1) == 1){
                result *= x;
            }

            // Square the base
            x *=x;

            //half the power
            power /=2;
        }


        return result;
    }
}