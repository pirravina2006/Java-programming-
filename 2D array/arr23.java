import java.util.Scanner;
public class arr23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int k=0;
        int val[]=new int[n*2+2];
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum=sum+arr[i][j];
            }
            val[k]=sum;
            k++;
        }
        int sum2=0;
        for(int j=0;j<n;j++){
            sum2=0;
            for(int i=0;i<n;i++){
                sum2=sum2+arr[i][j];
            }
            val[k]=sum2;
            k++;
        }
        int sum3=0;
        int sum4=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum3=sum3+arr[i][j];
                }
                if(i+j==n-1){
                    sum4=sum4+arr[i][j];
                }
            }
        }
        val[k]=sum3;
        k++;
        val[k]=sum4;
        k++;
        int tar=val[0];
        int count=0;
        int temp=k-1;
        for(int i=0;i<k-1;i++){
            if(val[i]==tar){
                count++;
            }
        }
        if(count==temp){
            System.out.println("Magic square");
            System.out.println("(Constant : "+tar+")");
        }
        else{
            System.out.println("Not a magic square");
            System.out.println("(Constant : "+tar+")");
        }
        sc.close();
    }
}