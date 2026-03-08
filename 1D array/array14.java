import java.util.Scanner;
public class array14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        double sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];
        }
        double avg=sum/n;
        double max=arr[0];
        int maxindex=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        double thres=avg*0.8;
        int underper=0;
        for(int i=0;i<n;i++){
            if(arr[i]<thres){
                underper++;
            }
        }
        System.out.println("Total plots : "+n);
        System.out.println("Total harvest : "+sum+"tons");
        System.out.printf("Average Yield : %.2f tons/acre",avg);
        System.out.println();
        System.out.println("Highest Yield : "+max+" tons/acre"+"(Plot "+(maxindex+1)+")");
        System.out.println("Underperforming plots : "+underper);
        System.out.printf("Performance Threshold : %.2f tons/acre",thres);
        sc.close();
    }
}
