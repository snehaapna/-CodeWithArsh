class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long res=0;
       // int cost=1;
        long conn[]=new long[n];
        for(int i=0;i<roads.length;i++){
            conn[roads[i][0]]++;
            conn[roads[i][1]]++;
        }
        
        Arrays.sort(conn);
        for( int i=0;i<n;i++){
            res+=conn[i]*(i+1);
        
        }
        
            return res;
        
    }   
        
    }