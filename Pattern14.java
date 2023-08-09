package Main;

public class Pattern14 {

    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++){
            for(int space = 3; space >= row; space--){
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            for (int col2 = row - 1 ; col2 >= 1; col2-- ){
                System.out.print(col2 + " ");
            }
            System.out.println();
        }
    }
}
