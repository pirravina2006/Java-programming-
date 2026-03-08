import java.util.Scanner;
public class array20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg=((double)sum/n);
        int max=arr[0];
        int min=arr[0];
        int count=0;
        int maxindex=0;
        int minindex=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
            if(arr[i]<60){
                count++;
            }
        }
        double per=((double)(n-count)/n)*100;
        System.out.println("Total students : "+n);
        System.out.printf("Average Completion : %.2f%%",avg);
        System.out.println();
        System.out.println("Highest Completion : "+max+"% ( Student "+maxindex+")");
        System.out.println("Lowest Completion : "+min+"% ( Student "+minindex+")");
        System.out.println("At-Risk Students (<60%) : "+count);
        System.out.printf("Success rate: %.2f%%",per);
        sc.close();
    }
}
