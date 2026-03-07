import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        double sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
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
            if(arr[i]>200){
                count++;
            }
        }
        double avg=sum/n;

        double per=(double) ((n-count)/n)*100;

        System.out.println("Total servers : "+n);
        System.out.println("Fastest responses : "+min+"ms");
        System.out.println("Slowest responses : "+max+"ms");
        System.out.printf("Average responses : %.2f",avg,"ms");
        System.out.println();
        System.out.println("Slow servers (>200ms) : "+count);
        System.out.printf("Performance score : %.2f%%",per);
        sc.close();
    }
}
