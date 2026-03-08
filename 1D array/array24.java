import java.util.Scanner;

public class array24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        double sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];
        }
        double avg=((double)sum/n);
        double max=arr[0];
        double min=arr[0];
        int maxindex=0;
        int minindex=0;
        double bargain=0.7*avg;
        double premium=1.5*avg;
        int barc=0;
        int prec=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
            if(arr[i]<bargain){
                barc++;
            }
            if(arr[i]>premium){
                prec++;
            }
        }
        System.out.println("Total Properties : "+n);
        System.out.println("Portfolio Value : $"+sum);
        System.out.printf("Average Property Value : %.2f $",avg);
        System.out.println();
        System.out.println("Most Valuable : $"+max+" (Property "+(maxindex+1)+")");
        System.out.println("Least Valuable : $"+min+" (Property "+(minindex+1)+")");
        System.out.println("Bargain properties (<70% avg) : "+barc);
        System.out.println("Premium properties (>150% avg) : "+prec);
        sc.close();
    }
}
