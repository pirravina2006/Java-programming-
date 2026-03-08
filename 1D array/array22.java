import java.util.Scanner;

public class array22 {
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
        int count=0;
        double thres=2*avg;
        int therscount=0;
        int k=1;
        int index[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
            if(arr[i]>200){
                count++;
            }
            if(arr[i]>thres){
                therscount++;
                index[k]=i;
                k++;
            }
        }

        System.out.println("Total Posts : "+n);
        System.out.printf("Average Engagement : %.2f %%",avg);
        System.out.println();
        System.out.println("Peak Engagement : "+max+"% (Post "+(maxindex+1)+")");
        System.out.println("Lowest Engagement : "+min+"% (Post "+(minindex+1)+")");
        System.out.println("Viral Posts (>200% avg): "+count);
        System.out.printf("Viral Threshold : %.2f %%",thres);
        System.out.println();
        System.out.print("Top performers : [");
        for(int i=1;i<k;i++){
            System.out.print(index[i]+" ");
        }
        System.out.print("]");
        sc.close();
    }
}
