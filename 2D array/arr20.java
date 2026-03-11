import java.util.Scanner;
import java.lang.String;
public class arr20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Output : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        String status="Symmetric";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i][j]!=arr[j][i]){
                    status="Asymmetric";
                }
            }
        }
        System.out.println();
        System.out.println("Status : "+status);
        sc.close();
    }
}