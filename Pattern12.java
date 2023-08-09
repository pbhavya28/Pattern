package Main;

public class Pattern12 {
    public static void pattern12(int n){
        for (int row = n; row >= 1; row--){
            int colInRow;
            if (row % 2 == 0){
                colInRow = (row * (row + 1) / 2);
            }else {
                colInRow = (row * (row - 1) / 2) + 1;
            }
            for (int col = 1; col <= row; col++){
                if (row % 2 == 0){
                    System.out.print(colInRow-- + " ");
                }else {
                    System.out.print(colInRow++ + " ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern12(6);
    }
}

