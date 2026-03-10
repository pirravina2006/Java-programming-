import java.util.Scanner;
public class arr21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and column : ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr[][]=new int[r1][c1];
        System.out.println("Enter array elements : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter row and column : ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        System.out.println("Enter array elements : ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix A : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix B : ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Result Matrix : ");
        if(c1==r2){
            int res[][]=new int[r1][c1];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        res[i][j]=res[i][j]+arr[i][k]*arr2[k][j];
                    }
                }
            }

            for(int m=0;m<r1;m++){
                for(int n=0;n<c1;n++){
                    System.out.print(res[m][n]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid Multiplication ");
        }
        sc.close();
    }
}
