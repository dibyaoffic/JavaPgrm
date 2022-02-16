public class MatrixMulti {
  public static void main(String[] args) {
    int[][] a1 = { { 1, 2, 3, }, { 1, 2, 3 },{1,2,3} };
    int[][] a2 = { { 1, 2, 3, }, { 1, 2, 3 },{1,2,3} };
    int[][] temp = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          
          temp[i][j] = temp[i][j] + (a1[i][k]) * (a2[k][j]);
        }
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(temp[i][j]+" ");
      }
      System.out.println("");
    }
  }
}