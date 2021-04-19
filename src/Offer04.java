import java.util.Scanner;

public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int left,right,top,bottom;
        left = 0;
        right = matrix[0].length - 1;
        top = 0;
        bottom = matrix.length - 1;
        int i;
        while (top <= bottom && right >= left){
            if (matrix[top][right] > target){
                right--;
            }
            else if (matrix[top][right] < target){
                top++;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Offer04 offer04 = new Offer04();
        int n,m,target;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        target = scanner.nextInt();
        System.out.println(offer04.findNumberIn2DArray(matrix,target));
    }
}
