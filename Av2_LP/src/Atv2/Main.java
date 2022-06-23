package Atv2;

public class Main {
    public static void main(String[] args) {
        int array[][] = {{3, 4}, {3, 4}};
        int array1[][] = {{2, 6}, {2, 6}};
        int l = array.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        int m = array1.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + array1[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(" " + (array[i][j] / array1[i][j]));
            }
            System.out.println(" ");
        }
    }
}
