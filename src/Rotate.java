// Timothy Lafontaine ID : 261066866

public class Rotate {

    public static void main(String[] args) {
        int[][] matrix ={{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        printFunc(matrix);

        System.out.println();

        printFunc(rotate180(matrix));
    }

    public static void printFunc(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(String.valueOf(arr[i][j]) + '\t');
            }
            System.out.println();
        }
    }

    public static int[][] rotate180(int[][] matrix){
        int[][] rotateMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                rotateMatrix[i][j] = matrix[matrix.length - i - 1][matrix[0].length- j - 1];
            }
        }
        return rotateMatrix;
    }
}
 // Thanks for reading my code 