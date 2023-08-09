package Main;

public class Pattern10 {
    public static void pattern10(int n){
        int k = n * (n + 1) / 2;
        for(int row = 1; row <= n; row++){
            for (int col = n; col >= row; col--){
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern10(4);
    }
}
