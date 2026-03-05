import java.util.Scanner;
public class loop17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hei=sc.nextInt();
        int wid=sc.nextInt();
        for(int i=1;i<=hei;i++){
            for(int j=1;j<=wid;j++){
                if(i==1 || i==hei || j==1 || j==wid){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
