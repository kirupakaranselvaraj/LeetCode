// Last updated: 09/07/2026, 09:10:33
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while (mainTank > 0) {
            if (mainTank >= 5 && additionalTank > 0) {
                mainTank -= 4;
                additionalTank--;
                distance += 50;
            } else {
                distance += mainTank * 10;
                mainTank = 0;
            }
        }
        return distance;
    }
}
