import java.util.Scanner;

public class Offer29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0)
            return new int[0];

        int row=matrix.length;//行
        int column=matrix[0].length;//列
        int circleLength=2*column+2*(row-2);
        int total=row*column;
        int[] size=new int[row*column];
        int num=0;
        int row_num=0,column_num=0;

        while (circleLength>=0) {
            for (int i=0;i<column&&num<total;i++){
                size[num++]=matrix[row_num][column_num++];
            }
            column_num--;
            row_num++;
            for (int i=0;i<row-1&&num<total;i++){
                size[num++]=matrix[row_num++][column_num];
            }
            row_num--;
            column_num--;
            for (int i=0;i<column-1&&num<total;i++){
                size[num++]=matrix[row_num][column_num--];
            }
            column_num++;
            row_num--;
            for (int i=0;i<row-2&&num<total;i++){
                size[num++]=matrix[row_num--][column_num];
            }
            row_num++;

            row-=2;
            column-=2;
            circleLength=2*column+2*(row-2);

            column_num+=1;
        }

        for (int i=0;i<total;i++)
            System.out.println(size[i]);
        return size;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        Offer29 offer29 = new Offer29();
        offer29.spiralOrder(matrix);
    }
}
