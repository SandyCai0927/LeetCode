public class Offer10_2 {
    private int[] ways = new int[101];

    public int numWays(int n) {
        return num(n);
    }

    public int num(int n){
        int i = 2;
        ways[0] = 1;
        ways[1] = 1;
        while (i<=n){
            ways[i] = (int) ((ways[i-1]+ways[i-2])%(1e9+7));
            i++;
        }
        return ways[n];
    }

    public static void main(String[] args){
        Offer10_2 offer10_2 = new Offer10_2();
        System.out.println(offer10_2.numWays(7));
    }
}
