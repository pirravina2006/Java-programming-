import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n];
        double sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        float max=arr[0];
        float min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        double avg=sum/n;

        System.out.println("Total sales : "+n);
        System.out.println("Highest sales : $"+max);
        System.out.println("Lowest sales : $"+min);
        System.out.printf("Total sales : $%.2f",sum);
        System.out.println();
        System.out.printf("Average sales : $%.2f",avg);
        sc.close();
    }
}
