package MatrixProcessing;

import java.util.Scanner;
import java.util.ArrayList;

public class MatrixProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add matrix");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            MatrixOperation operation = (choice == 1) ? MatrixOperation.ADD : MatrixOperation.EXIT;
            if (operation == MatrixOperation.EXIT) break;
            if (operation == MatrixOperation.ADD) {
                System.out.print("Enter number of rows and columns for your matrix: ");
                int n1 = scanner.nextInt();
                int m1 = scanner.nextInt();
                ArrayList<ArrayList<Double>> A = new ArrayList<>();
                for (int i = 0; i < n1; i++) {
                    ArrayList<Double> row = new ArrayList<>();
                    for (int j = 0; j < m1; j++) {
                        row.add(scanner.nextDouble());
                    }
                    A.add(row);
                }
                System.out.print("Enter number of rows and columns for your matrix: ");
                int n2 =  scanner.nextInt();
                int m2 = scanner.nextInt();
                ArrayList<ArrayList<Double>> B = new ArrayList<>();
                for (int i = 0; i < n2; i++) {
                    ArrayList<Double> row = new ArrayList<>();
                    for (int j = 0; j < m2; j++) {
                        row.add(scanner.nextDouble());
                    }
                    B.add(row);
                }
                if (n1 != n2 || m1 != m2) {
                    System.out.println("Invalid input");
                    continue;
                }
                for (int i = 0; i < n1; i++) {
                    for (int j = 0; j < m1; j++) {
                        double sum = A.get(i).get(j) + B.get(i).get(j);
                        System.out.print(sum + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

}
