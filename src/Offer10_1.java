import java.util.ArrayList;

public class Offer10_1 {
    private int[] fibo = new int[101];

    public int fib(int n) {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return f(n);
    }

    public int f(int n){
        fibo[0] = 0;
        fibo[1] = 1;
        int i = 2;
        while (i<=n){
            fibo[i] = (int) ((fibo[i-1] + fibo[i-2]) % (1e9+7));
            i++;
        }
        return fibo[n];
    }
}
