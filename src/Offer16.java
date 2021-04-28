import java.util.Scanner;

public class Offer16 {
    public double myPow(double x, int n) {
        if (n==0)
            return 1.0000;
        long m = n;
        double y=1.0;
        if (n<0){
            m=-n;
            x=1/x;
        }
        while (m>1){
            if ((m&1)==1)
                y*=x;
            x*=x;
            m=m>>1;
        }
        return y;
    }

    public static void main(String[] args) {
        Offer16 offer16 = new Offer16();
        double x;
        int n;
        Scanner scanner = new Scanner(System.in);
        x=scanner.nextDouble();
        n=scanner.nextInt();
        System.out.println(offer16.myPow(x,n));
    }
}
