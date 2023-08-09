package Main;

public class Pattern13 {
    public static void pattern13(int n){
        for(int row = 1; row <= n; row++ ){
            for(int col = 1;  col <= row; col++){
                System.out.print("*");
            }
            for(int col = n;  col >= row; col--){
                System.out.print("  ");}
            for(int col = 1;  col <= row; col++){
                System.out.print("*");}
            System.out.println();



        }




        }


    public static void main(String[] args) {
         pattern13(5);
    }
}
