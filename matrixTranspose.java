import java.util.Scanner;

public class matrixTranspose {

    public static void main(String[] args) {
        int n;
        int m;

        Scanner input = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        m = input.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        n = input.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("\nMatrisin elemanlarını girin.");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matrisin " + (i + 1) + ". satır " + (j + 1) + ". sütun elemanını girin: ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("\nMatris: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int transpose[][] = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpoze: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
