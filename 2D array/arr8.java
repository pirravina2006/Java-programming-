import java.util.Scanner;
public class arr8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int val=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original Image : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Adjusted Image : ");
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=arr[i][j]+val;
                if(sum>250){
                    sum=255;
                    System.out.print(sum+" ");
                }
                else{
                    System.out.print(sum+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}