import java.util.Scanner;
public class array13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int max=arr[0];
        int count=0;
        int com=0;
        double avg=(double)sum/n;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<=15){
                count++;
            }
            if(arr[i]>180){
                com++;
            }
        }
        double per=(double)(count/n)*100;
        System.out.println("Total Flights : "+n);
        System.out.printf("Average Delay : %.2f",avg,"minutes");
        System.out.println();
        System.out.println("Maximum Delay : "+max+" minutes");
        System.out.println("On-time Flights : "+count);
        System.out.println("Compensation required : "+com);
        System.out.printf("On-Time Performance : %.2f",per,"%");
        sc.close();
    }
}
