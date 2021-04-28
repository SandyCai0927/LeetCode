public class Offer15 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int m=1;
        int count = 0;
        for (int i=0;i<32;i++){
            if ((n&m)==1)
                count++;
            n=n>>>1;
        }
        return count;
    }
}
