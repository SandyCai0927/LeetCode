public class Offer13 {
    public int movingCount(int m, int n, int k) {
        int[][] area = new int[m][n];
        int count = 0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                area[i][j]=1;
            }
        }
        count = move(area,m,n,0,0,k);
        return count;
    }

    public int digitSum(int x){
        int sum=0;
        while (x!=0){
            sum+=x%10;
            x = x/10;
        }
        return sum;
    }

    public int move(int[][] area,int m,int n, int x,int y,int k){
        if(x<0||x>=m||y<0||y>=n||area[x][y]==0)
            return 0;
        int sum=digitSum(x)+digitSum(y);
        if (k<sum){
            area[x][y]=0;
            return 0;
        }
        else{
            area[x][y]=0;
            return 1+move(area,m,n,x+1,y,k)+move(area, m, n, x-1, y, k)+move(area, m, n, x, y+1, k)+move(area, m, n, x, y-1, k);
        }
    }

}
