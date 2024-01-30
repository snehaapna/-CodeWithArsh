class Solution {
    public int diagonalSum(int[][] mat) {
        //primary diagonal
        int sum=0,n=mat.length;
        for(int i=0;i<n;i++){
              sum+=mat[i][i];
        //secondary diagonal
        if(i!=n-1-i)
           sum+=mat[i][n-1-i];}
        return sum;
    }
}