import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 3x3 matrix
        int n = 3;

        int[][] matrix = new int[n][n];
        Random rand = new Random();

        while (true) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = rand.nextInt(99) + 1;
                }
            }

            int row1 = matrix[0][0] + matrix[0][1] + matrix[0][2];
            int row2 = matrix[1][0] + matrix[1][1] + matrix[1][2];
            int row3 = matrix[2][0] + matrix[2][1] + matrix[2][2];

            int col1 = matrix[0][0] + matrix[1][0] + matrix[2][0];
            int col2 = matrix[0][1] + matrix[1][1] + matrix[2][1];
            int col3 = matrix[0][2] + matrix[1][2] + matrix[2][2];

            int diag1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
            int diag2 = matrix[2][0] + matrix[1][1] + matrix[0][2];

            if (row1 == row2 && row2 == row3 && row3 == col1 && col1 == col2 && col2 == col3 && col3 == diag1 && diag1 == diag2) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(matrix[i][j] + ", ");
                    }
                    System.out.println();
                }
                
                break;
            }
            
        }

       
    }
}