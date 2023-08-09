package Main;

public class Pattern6 {

    public static void main(String[] args) {
        int i,j;

        for(i=1; i<=5; i++){

            for(j=1; j<=i; j++){

                if (j%2==1){

                    System.out.print("1");

                }
                else{
                    System.out.print("0");
                }
            }
            for(j=1; j<=i; j++){

                if(i%2==1){
                    if (j%2==1){

                        System.out.print("1");

                    }
                    else{
                        System.out.print("0");
                    }

                }
                if(i%2==0){
                    if (j%2==1){

                        System.out.print("0");

                    }
                    else{
                        System.out.print("1");
                    }

                }
            }
            System.out.println();
        }
    }
}
