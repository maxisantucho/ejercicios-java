
package Exercises;

public class LeetCode {
    
    public static int[][] matrizAddition(int[][] a, int[][] b) {
            int first = a.length;
            int second = a[0].length;
            int[][] newMatriz = new int[first][second];
            for(int i=0; i<first; i++){
              for(int j=0; j<second; j++) {
                newMatriz[i][j] = a[i][j] + b[i][j];
              }
            }
            return newMatriz;
	}

    public static void main(String[] args) {
        
        int[][] a = {{1, 2, 3}, {3, 2, 1}, {1, 1, 1}};
        int[][] b = {{2, 2, 1}, {3, 2, 3}, {1, 1, 3}};
        
        matrizAddition(a, b);
        
    }
}
