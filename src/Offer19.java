import java.util.Scanner;

public class Offer19 {
    public boolean isMatch(String s, String p) {
        int n=s.length(),m=p.length();
        boolean[][] dp = new boolean[n+1][m+1];

        for (int i=0;i<=n;i++) {
            for (int j=0;j<=m;j++) {
                if (j==0) {
                    dp[i][j] = i==0;
                }
                else {
                    if (p.charAt(j-1)!='*') {
                        if (i>0&&(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.'))
                            dp[i][j]=dp[i-1][j-1];
                    }
                    else{
                        if (j>1)
                            dp[i][j] = dp[i][j-2];
                        if (i>0&&j>1&&(s.charAt(i-1)==p.charAt(j-2)||p.charAt(j-2)=='.'))
                            dp[i][j] |= dp[i-1][j];
                    }
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s,p;
        s=scanner.nextLine();
        p=scanner.nextLine();
        Offer19 offer19 = new Offer19();
        System.out.println(offer19.isMatch(s,p));
    }
}
