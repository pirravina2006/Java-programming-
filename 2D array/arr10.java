import java.util.Scanner;
public class arr10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sales Matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        System.out.println("Representative Total : ");
        for(int i=0;i<r;i++){
            sum=0;
            for(int j=0;j<c;j++){
                sum=sum+arr[i][j];
            }
            System.out.print("Rep "+(i+1)+" : "+sum);
            System.out.println();
        }
        System.out.println();
        int sum2=0;
        System.out.println("Territory Totals : ");
        for(int j=0;j<c;j++){
            sum2=0;
            for(int i=0;i<r;i++){
                sum2=sum2+arr[i][j];
            }
            System.out.print("Territory "+(j+1)+" : "+sum2);
            System.out.println();
        }
        sc.close();
    }
}
