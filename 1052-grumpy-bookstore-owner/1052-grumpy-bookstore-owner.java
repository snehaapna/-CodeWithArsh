class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }
        int grump = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                grump += customers[i];
            }
        }
        int totalgrump = grump;
        int i = 0, j = minutes;
        while (j < grumpy.length) {
            if (grumpy[i] == 1)
                grump -= customers[i];
            if (grumpy[j] == 1) {
                grump += customers[j];
            }
            totalgrump = Math.max(totalgrump, grump);
            i++;
            j++;
        }
        return totalgrump+sum;
    }
}
