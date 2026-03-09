import java.util.Scanner;
public class array4 {
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
        System.out.println("Sales Data : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int sum=0;
        int max=0;
        int maxindex=0;
        System.out.println("Product-wise Total sales : ");
        for(int i=0;i<r;i++){
            sum=0;
            for(int j=0;j<c;j++){
                sum=sum+arr[i][j];
                if(sum>max){
                    max=sum;
                    maxindex=i;
                }
            }
            System.out.print("Product "+(i+1)+" : "+sum);
            System.out.println();
        }
        System.out.println();
        System.out.println("Best Selling Product : Product "+(maxindex+1)+" with "+max+" units");
        sc.close();
    }
}