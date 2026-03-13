import java.util.Scanner;
public class array1 {
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
        double sum=0;
        System.out.println("Student Averages : ");
        double avg=0;
        for(int i=0;i<r;i++){
            sum=0;
            for(int j=0;j<c;j++){
                sum=sum+arr[i][j];
            }
            avg=(double)sum/c;
            System.out.print("Student "+(i+1));
            System.out.printf(" : %.2f",avg);
            System.out.println();
        }
        System.out.println();
        double sum2=0;
        System.out.println("Subject Averages : ");
        double avg2=0;
        for(int j=0;j<c;j++){
            sum2=0;
            for(int i=0;i<r;i++){
                sum2=sum2+arr[i][j];
            }
            avg2=(double)sum2/r;
            System.out.print("Subject "+(j+1));
            System.out.printf(" : %.2f",avg2);
            System.out.println();
        }
        sc.close();
    }
}
