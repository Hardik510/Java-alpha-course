public class staircaseSearch {
    public static void search(int mat[][], int key){
        int row = 0;
        int col = mat[0].length-1;

        while(row <= mat.length-1 && col >= 0){
            if(mat[row][col] == key){
                System.out.println(row + " " + col);
                return;
            }
            else if(mat[row][col] > key){
                col -= 1;
            }
            else{
                row += 1;
            }
        }
        System.out.println(-1);
        return;

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        // int matrix[][] = {{1,2,3},
        //                   {4,5,6},
        //                   {7,8,9}};
        int key = 200;
        search(matrix, key);
    }
}
