import java.math.BigInteger;
import java.util.Arrays;

public class Offer14_1 {

    private BigInteger[] dp = new BigInteger[1001];

    public int cuttingRope(int n) {
        Arrays.fill(dp, BigInteger.valueOf(1));
        for (int i=3;i<=n;i++){
            for (int j=1;j<i;j++){
                dp[i] = dp[i].max(dp[i-j].multiply(BigInteger.valueOf(j)));
                dp[i] = dp[i].max(BigInteger.valueOf(i-j).multiply(BigInteger.valueOf(j)));
            }
        }
        return dp[n].mod(BigInteger.valueOf(1000000007)).intValue();
    }



    public static void main(String[] args){
        Offer14_1 offer14_1 = new Offer14_1();
        System.out.println(offer14_1.cuttingRope(10));
    }
}
