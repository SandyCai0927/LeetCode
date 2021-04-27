/*
 * 未通过
 */
public class Offer14_1 {

    private int[] dp = new int[1001];

    public int cuttingRope(int n) {
        dp[1]=1;
        dp[2]=1;
        for (int i=3;i<=n;i++){
            for (int j=1;j<i;j++){
                dp[i] = (int) ((Math.max(j*dp[i-j],dp[i]))%(1e9+7));
                dp[i] = (int) ((Math.max(j*(i-j),dp[i]))%(1e9+7));
            }
        }
        return dp[n];
    }



    public static void main(String[] args){
        Offer14_1 offer14_1 = new Offer14_1();
        System.out.println(offer14_1.cuttingRope(10));
    }
}
