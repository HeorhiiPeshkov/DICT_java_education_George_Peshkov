package MatrixProcessing;

import java.util.Scanner;

public class MatrixProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add matrix");
            System.out.println("2. Multiply matrix by a constant");
            System.out.println("3. Multiple matrix");
            System.out.println("4. Transpose matrix");
            System.out.println("5. Find matrix determinant");
            System.out.println("6. Find matrix inverse");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            MatrixOperation operation = switch (choice) {
                case 1 -> MatrixOperation.ADD;
                case 2 -> MatrixOperation.MULTIPLY_BY_A_CONSTANT;
                case 3 -> MatrixOperation.MULTIPLY_MATRICES;
                case 4 -> MatrixOperation.MATRIX_TRANSPOSING;
                case 5 -> MatrixOperation.MATRIX_DETERMINANT;
                case 6 -> MatrixOperation.MATRIX_INVERSE;
                default ->  MatrixOperation.EXIT;
            };
            switch (operation) {
                case ADD -> MatrixSum.addMatrix(scanner);
                case MULTIPLY_BY_A_CONSTANT ->  MatrixMultipleConstant.multipleconstantMatrix(scanner);
                case MULTIPLY_MATRICES -> MatrixMultiple.multipleMatrices(scanner);
                case MATRIX_TRANSPOSING -> MatrixTransposing.transposeMatrix(scanner);
                case MATRIX_DETERMINANT -> MatrixDeterminant.calculateDeterminant(scanner);
                case MATRIX_INVERSE -> MatrixInverse.inverseMatrix(scanner);
                case EXIT -> {
                    return;
                }
            }
        }
    }

}
