import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1;i<=col;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=col;j++){
                System.out.print((i*j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
