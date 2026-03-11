import java.util.Scanner;
public class arr16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int pascal[][]=new int[n][];
        // for(int i=0;i<n;i++){
        //     pascal[i][0]=1;
        //     pascal[i][i]=1;
        //     System.out.print(pascal[i][i]+" ");
        // }
        int num;
        for(int i=0;i<n;i++){
            num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num +" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}