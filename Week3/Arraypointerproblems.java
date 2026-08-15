public class ArrayPointerProblems {

    // LC 1672 - Richest Customer Wealth
    static int maximumWealth(int[][] accounts) {

        int maximum = 0;

        for (int row = 0; row < accounts.length; row++) {

            int wealth = 0;

            for (int column = 0;
                 column < accounts[row].length;
                 column++) {

                wealth += accounts[row][column];
            }

            if (wealth > maximum) {
                maximum = wealth;
            }
        }

        return maximum;
    }


    // LC 27 - Remove Element
    static int removeElement(int[] nums, int val) {

        int write = 0;

        for (int read = 0; read < nums.length; read++) {

            if (nums[read] != val) {

                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }
}
