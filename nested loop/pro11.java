import java.util.Scanner;

public class pro11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int j=0;
        int num;
        for(i=0;i<n;i++){
            num=1;
            for(j=0;j<=i;j++){
                System.out.print(num);
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
