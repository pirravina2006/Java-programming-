class pattern2{
    public static void main(String[]args){
        // int star=1;
        // int space=3;
        // for(int i=1;i<=4;i++){
        //     for(int k=1;k<=space;k++){
        //         System.out.print("   ");
        //     }
        //     for(int j=1;j<=star;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        //     star++;
        //     space--;
        // }

        for(int j=4;j>=1;j--){
            for(int i=1;i<=4;i++){
                if(i>=j){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}