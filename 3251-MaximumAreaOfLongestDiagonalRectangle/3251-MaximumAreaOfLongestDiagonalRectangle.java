// Last updated: 09/07/2026, 09:10:30
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;
        
        for (int[] dim : dimensions) {
            int length = dim[0], width = dim[1];
            double diagonal = Math.sqrt(length * length + width * width);
            int area = length * width;
            
            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal && area > maxArea) {
                maxArea = area;
            }
        }
        
        return maxArea;
    }
}
