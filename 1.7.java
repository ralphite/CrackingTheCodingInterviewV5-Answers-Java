//cci150 1.7

//O(m*n) time O(1) space

public class MatrixUtil {
    public static void expandZeros(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;
        for(int r = 0; r < matrix.length; r++) {
            if(matrix[r][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }
        for(int c = 0; c < matrix[0].length; c++) {
            if(matrix[0][c] == 0) {
                firstRowHasZero = true;
                break;
            }
        }
        for(int r = 0; r < matrix.length; r++) {
            for(int c = 0; c < matrix[r].length; c++) {
                if(matrix[r][c] == 0) {
                    matrix[0][c] = 0;
                    matrix[r][0] = 0;
                }
            }
        }
        for(int r = 0; r < matrix.length; r++) {
            if(matrix[r][0] == 0) {
                for(int c = 1; c < matrix[r].length; c++) {
                    matrix[r][c] = 0;
                }
            }
        }
        for(int c = 0; c < matrix[0].length; c++) {
            if(matrix[0][c] == 0) {
                for(int r = 1; r < matrix.length; r++) {
                    matrix[r][c] = 0;
                }
            }
        }
        if(firstRowHasZero) {
            for(int c = 0; c < matrix[0].length; c++) {
                matrix[0][c] = 0;
            }
        }
        if(firstColHasZero) {
            for(int r = 0; r < matrix.length; r++) {
                matrix[r][0] = 0;
            }
        }
    }
}
