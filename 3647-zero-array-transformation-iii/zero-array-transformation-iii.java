// class Solution {
//     public int maxRemoval(int[] nums, int[][] queries) {
//         int n=nums.length;
//         int diff[]=new int[n+2];
//         int rem[]=new int[n];
//         for(int i=0;i<queries.length;i++){
//             diff[queries[i][0]]+=1;
//             if(queries[i][1]+1<n)  diff[queries[i][1]+1]-=1;
//         }
//         int val=0;
//         for(int i=0;i<n;i++){
//             val+=diff[i];
//             nums[i]-=val;
//             if(nums[i]>0) return -1;
//             rem[i]=Math.abs(nums[i]);
//         }
//         int ans=0;
//         for(int i:rem){
//             System.out.print(i+" ");
//         }
//         // for(int i=0;i<queries.length;i++){
//         //     int left=queries[i][0];
//         //     int right=queries[i][1];
//         //     if(rem[left]>0&&rem[right]>0){
//         //         rem[left]--;
//         //         rem[right]--;
//         //         ans++;
//         //     }
//         // }
//         // return ans;

//         Arrays.sort(queries, (a, b) -> Integer.compare(a[1], b[1]));
//         for(int[] q:queries){
//             int left=q[0];
//             int right=q[1];
//             boolean temp=true;
//             for(int i=left;i<=right;i++){
//                 if(rem[i]<1) temp=false;
//             }
//             if(temp){
//                 ans++;
//                 for(int i=left;i<=right;i++){
//                     rem[i]--;
                                    
//                 }
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        Arrays.sort(queries, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> available = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> assigned = new PriorityQueue<>();
        int count = 0;
        for (int time = 0, k = 0; time < nums.length; time++) {
            while (!assigned.isEmpty() && assigned.peek() < time)
                assigned.poll();
            while (k < queries.length && queries[k][0] <= time)
                available.add(queries[k++][1]);
            while (assigned.size() < nums[time]
                   && !available.isEmpty()
                   && available.peek() >= time) {
                assigned.add(available.poll());
                count++;
            }
            if (assigned.size() < nums[time])
                return -1;
        }
        return queries.length - count;
    }
}