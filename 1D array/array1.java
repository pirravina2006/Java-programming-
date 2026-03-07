import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n];
        float sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
            sum=sum+arr[i];
        }
        double avg=sum/n;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>avg){
                count++;
            }
        }
        double res=(double) count/n;
        double per=res*100;

        System.out.println("Total Employees : "+n);
        System.out.printf("Average salary : %.2f",avg);
        System.out.println();
        System.out.println("Employees above average : "+count);
        System.out.printf("Percentage : %.2f%%",per);
        sc.close();
    }
}
