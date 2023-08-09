package Main;
public class Pattern8 {
    public static void pattern8(int n){
       for (int row = 1; row <= n; row++){
           for (int col = 1; col <= row; col++){
               System.out.print(col + " ");
           }
           for (int col = row - 1; col >= 1 ; col--){
               System.out.print(col + " ");
           }
           System.out.println();
       }
   }
    public static void main(String[] args) {
       pattern8(5);
    }
}
