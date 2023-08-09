package Main;

public class Pattern6_new {

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                if (row == 3 && col == 3) {
                    System.out.print("A ");
                } else {
                    System.out.print(col % 2 + " ");
                }
            }
            if (row % 2 == 0) {
                for (int col2 = 1; col2 <= row; col2++) {
                    if (col2 % 2 == 1) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            } else {
                for (int col3 = 1; col3 <= row; col3++) {
                    if (row == 3 && col3 == 1) {
                        System.out.print("");
                    } else {
                        System.out.print(col3 % 2 + " ");
                    }
                }

            }
            System.out.println();
        }
    }
}
