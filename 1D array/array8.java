import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        float sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            sum=sum+arr[i];
        }
        double avg=sum/n;
        for(int i=0;i<n;i++){
            if(arr[i]>60){
                count++;
            }
        }
        double per=((n-count)/n)*100;
        System.out.println("Total patients : "+n);
        System.out.println("Longest wait time : "+max+" minutes");
        System.out.printf("Average wait time : %.2f",avg," minutes");
        System.out.println();
        System.out.println("Patients waiting >60 min : "+count);
        System.out.printf("Service Level : %.2f%%",per);
        sc.close();
    }
}
