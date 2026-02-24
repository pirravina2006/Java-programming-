public class Hpattern {
    public static void main(String[]args){
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                if(j==0||j==2||i==2){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        
    }
}
