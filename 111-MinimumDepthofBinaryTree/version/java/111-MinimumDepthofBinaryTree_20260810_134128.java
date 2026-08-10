// Last updated: 10/08/2026, 13:41:28
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> r=new ArrayList<>();
4        for(int i=0;i<=rowIndex;i++){
5            r.add(1);
6            for(int j=i-1;j>0;j--) r.set(j,r.get(j)+r.get(j-1));
7        }
8        return r;
9    }
10}