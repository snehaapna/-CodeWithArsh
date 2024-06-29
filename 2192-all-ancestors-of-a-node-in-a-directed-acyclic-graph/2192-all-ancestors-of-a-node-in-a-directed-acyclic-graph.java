class Solution {
    private void topoSort(List<List<Integer>> adj,int start ,Stack<Integer> st,boolean[] isVisited)
    {
    isVisited[start]=true;
        for(int ng : adj.get(start))
        {
            if(!isVisited[ng])
            {
                topoSort(adj,ng,st,isVisited);
            }
        }
        st.push(start);
    }
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges)
        {
            adj.get(edge[1]).add(edge[0]);
        }
        //toposort
        Stack<Integer> st = new Stack<>();
        boolean[] isVisited = new boolean[n];
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        if(!isVisited[i])
        topoSort(adj,i,st,isVisited);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            res.add(new ArrayList<>());
        }
        // System.out.println(st);
        for(int i=n-1;i>=0;i--)
        arr[i]=st.pop();
        // System.out.println(Arrays.toString(arr));
        for(int parent : arr)
        {
            List<Integer> temp = res.get(parent);
            Arrays.fill(isVisited,false);
            for(int ng : adj.get(parent))
            {
                for(int i : res.get(ng))
                {
                    if(!isVisited[i])
                    {
                        temp.add(i);
                        isVisited[i]=true;
                    }
                }
                if(!isVisited[ng])
                {
                    temp.add(ng);
                    isVisited[ng]=true;
                }
            }
            Collections.sort(temp);
        }
        return res;
    }
    
}

