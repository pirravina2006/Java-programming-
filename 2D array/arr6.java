import java.util.Scanner;
public class array6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Traffic Data : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Traffic per lane : ");
        int max=0;
        int maxindex=0;
        for(int i=0;i<r;i++){
            sum=0;
            for(int j=0;j<c;j++){
                sum=sum+arr[i][j];
                if(sum>max){
                    max=sum;
                    maxindex=i;
                }
            }
            System.out.println("Lane "+(i+1)+" : "+sum);
        }
        System.out.println("Busiest Hour : Hour "+maxindex+" with "+max+" Vehicles ");
        sc.close();
    }
}
