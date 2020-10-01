package matrix;

import java.util.HashMap;

public class BooleanMatrix {
    public static void main(String[] args) {
        booleanMatrix();

    }

    private static void booleanMatrix(){
        int mat[][] = {{1, 0, 0},
                {1, 0, 0},
                {1, 0, 0},
                {0, 0, 0}};


        int r = mat.length;
        int c = mat[0].length;

        int row[] = new int[r];
        int col[] = new int[c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (col[j] == 1 || row[i] == 1) {
                    mat[i][j] = 1;
                }

            }

        }


        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                    System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
