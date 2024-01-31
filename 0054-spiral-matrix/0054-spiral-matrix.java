class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
         ArrayList <Integer> currList=new ArrayList<>();
         
        while(left<=right&&top<=bottom){
            //TOP
            for(int j=left;j<=right;j++)
            {
                System.out.println(matrix[top][j]+" ");
                 
                currList.add(matrix[top][j]);
                
            }
            //RIGHT
            for(int i=top+1;i<=bottom;i++)
            {
               //  System.out.println(matrix[right][i]+" ");
                  currList.add(matrix[i][right]);
              }
            //BOTTOM
            for(int j=right-1;j>=left;j--)
            {
               if(bottom==top) 
               {
                   break;
               }
                // System.out.println(matrix[bottom][j]+" ");
                currList.add(matrix[bottom][j]);
            }
            // LEFT
            for(int i=bottom-1;i>=top+1;i--)
            {
                if(left==right){
                        break;}
                //System.out.println(matrix[left][i]+" ");
                 currList.add(matrix[i][left]);
            }
            top++;
            left++;
            bottom--;
            right--;
          }
         return currList;
    }
   
}