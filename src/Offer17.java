public class Offer17 {
    public int[] printNumbers(int n) {
        int[] res = new int[(int) Math.pow(10,n)];
        for (int i=1;i<(int) Math.pow(10,n);i++){
            res[i]=i;
        }
        return res;
    }
}
