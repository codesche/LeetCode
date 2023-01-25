class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<int[]> q = new ArrayDeque<>();
        int ans = Integer.MIN_VALUE;
        
        for (int[] p : points) {
            while (!q.isEmpty() && q.peek()[0] + k < p[0])     {
                q.remove();
            }
            
            int diff = p[1] - p[0];
            int plus = p[1] + p[0];
            
            if (!q.isEmpty()) {
                int eq = plus + q.peek()[1];
                ans = Math.max(ans, eq);
            }
            
            while (!q.isEmpty() && q.getLast()[1] < diff) {
                q.removeLast();
            }
            
            q.add(new int[] {p[0], diff});
        }
        
        return ans;
    }
}