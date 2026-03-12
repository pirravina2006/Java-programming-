import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1 : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix 2 : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum Matrix : ");
        int sum=0;
        for(int i=0;i<r;i++){
            sum=0;
            for(int j=0;j<c;j++){
                sum=a[i][j]+b[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
