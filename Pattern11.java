package Main;

public class Pattern11 {
    public static void pattern11(int n){
        for (int row = n; row >= 1; row--){
            int colInRow;
            if (row % 2 == 0){
                colInRow = (row * (row + 1) / 2) - row + 1;
            }else {
                colInRow = (row * (row - 1) / 2) + 1;
            }
            for (int col = 1; col <= row; col++){
                System.out.print(colInRow++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern11(4);
    }
}
