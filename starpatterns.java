public class starpatterns {
    public static void main(String[] args){
        //SOLID RECTANGLE
        // for(int i =1; i<=3; i++){
        //     for(int j=1;j<=3;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //HOLLOW RECTANGLE
        // int n =4;
        // int m=5;
        // for(int i = 1;i<=n;i++){
        //     for(int j=1 ; j<=m;j++){
        //         if(i==1 || i==n || j==1 || j==m){ // n is number of rows and m is number of columns
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        //HALF PYRAMID
        // for(int i=0;i<=5;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //INVERTED HALF PYRAMID
        // for(int i=5;i>=0;i--){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //
        //ROTATED HALF PYRAMID
        for(int i = 1; i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");//for space
            }

            for(int j =1;j<=i;j++){
                System.out.print("*");//for star
            }
            System.out.println();
        } 

    }
}
