package Main;

public class Pattern5 {
    public static void main(String[] args) {
        int i,j;

        for(i=1;i<=7;i++){

            if (i%3==1){
                System.out.print("*");
                System.out.println();
            }
            if (i%3==2){
                System.out.print("**");
                System.out.println();
            }
            if (i%3==0){
                System.out.print("***");
                System.out.println();
            }

        }
    }
}
