import java.util.Scanner;
public class array15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg=(double)sum/n;
        int max=arr[0];
        int min=arr[0];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>300){
                count++;
            }
        }
        double per=(double)((n-count)/n)*100;
        System.out.println("Total calls : "+n);
        System.out.printf("Average Handling time : %.2f seconds",avg);
        System.out.println();
        System.out.println("Shortest cell : "+min+" seconds");
        System.out.println("Longest cell : "+max+" seconds");
        System.out.println("Calls Exceeding Target (300s) : "+count);
        System.out.printf("Target compilance : %.2f %%",per);
        sc.close();
    }
}