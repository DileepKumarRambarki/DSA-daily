class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(hm.entrySet());
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry=pq.poll();
            for(int i=0;i<entry.getValue();i++){
                res+=entry.getKey();
            }
        }
        return res;
    }
}