public class ArrayTransformations {

    static void reverseInPlace(int[] values) {

        int left = 0;
        int right = values.length - 1;

        while (left < right) {

            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }

    static int[] reversedCopy(int[] values) {

        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }

        return result;
    }

    static int removeValue(int[] values, int target) {

        int write = 0;

        for (int read = 0; read < values.length; read++) {

            if (values[read] != target) {

                values[write] = values[read];
                write++;
            }
        }

        return write;
    }

    static int[] runningSum(int[] values) {

        int[] result = new int[values.length];

        if (values.length == 0) {
            return result;
        }

        result[0] = values[0];

        for (int i = 1; i < values.length; i++) {
            result[i] = result[i - 1] + values[i];
        }

        return result;
    }
}
