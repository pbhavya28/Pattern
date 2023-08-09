package Main;
public class Pattern9{
    public static void pattern9(int n){
        for (int i = 1; i <= n / 3; i++){
            for(int row = 1; row <= 3; row++){
                for (int col = 1; col <= row; col++){
                    System.out.print(col);
                }
                System.out.println();
            }
        }
        for (int row = 1; row <= n % 3; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern9(7);
    }

}