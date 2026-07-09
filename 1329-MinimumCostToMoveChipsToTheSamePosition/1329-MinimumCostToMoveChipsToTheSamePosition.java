// Last updated: 09/07/2026, 09:10:46
class Solution {
    public int minCostToMoveChips(int[] position) {
        int cost=0;
        int odd=0,even=0;
        for(int i:position){
            if(i%2==0)  even++;
            else odd++;
        }
        return Math.min(odd,even);
    }
}