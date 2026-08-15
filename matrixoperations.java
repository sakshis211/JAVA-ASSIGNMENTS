public class MatrixOperations {

    static int[] rowSums(int[][] matrix) {

        int[] result = new int[matrix.length];

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0;
                 column < matrix[row].length;
                 column++) {

                result[row] += matrix[row][column];
            }
        }

        return result;
    }

    static int[] columnSums(int[][] matrix) {

        if (matrix.length == 0) {
            return new int[0];
        }

        int columns = matrix[0].length;
        int[] result = new int[columns];

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0;
                 column < columns;
                 column++) {

                result[column] += matrix[row][column];
            }
        }

        return result;
    }

    static int[][] add(int[][] first, int[][] second) {

        if (first.length != second.length) {
            throw new IllegalArgumentException(
                "Matrices must have same dimensions."
            );
        }

        for (int i = 0; i < first.length; i++) {

            if (first[i].length != second[i].length) {
                throw new IllegalArgumentException(
                    "Matrices must have same dimensions."
                );
            }
        }

        int[][] result = new int[first.length][];

        for (int i = 0; i < first.length; i++) {

            result[i] = new int[first[i].length];

            for (int j = 0; j < first[i].length; j++) {

                result[i][j] =
                    first[i][j] + second[i][j];
            }
        }

        return result;
    }

    static int[][] transpose(int[][] matrix) {

        if (matrix.length == 0) {
            return new int[0][0];
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    static int[][] multiply(int[][] first, int[][] second) {

        if (first.length == 0 || second.length == 0) {
            throw new IllegalArgumentException(
                "Matrices cannot be empty."
            );
        }

        int firstColumns = first[0].length;
        int secondRows = second.length;

        if (firstColumns != secondRows) {
            throw new IllegalArgumentException(
                "First matrix columns must equal second matrix rows."
            );
        }

        int rows = first.length;
        int columns = second[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                for (int k = 0; k < firstColumns; k++) {

                    result[i][j] +=
                        first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
