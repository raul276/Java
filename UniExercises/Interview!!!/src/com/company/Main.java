package com.company;

public class Main {


    public static void main(String[] args) {
        int[][] matrix = getMatrix(4);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ;j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
    public static int[][] getMatrix(int n){
        int[][] matrix = new int[n][n];
        int cnt = 1;
        for (int i = 0; i < matrix.length; i++) {
            if(i %2 ==0) {
                for (int j = 0; j <matrix[i].length; j++) {
                    matrix[i][j] = cnt++;

                }
            }
            else
            {
                for (int j = matrix[i].length -1; j >=0 ; j--) {
                    matrix[i][j]=cnt++;
                }
            }
        }
        return  matrix;
    }
}
