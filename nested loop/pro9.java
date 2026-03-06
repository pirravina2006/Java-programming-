import java.util.Scanner;
public class pro9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int col=(n*2)-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=col;j++){
                if(j<=i){
                    System.out.print(j);
                }
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
