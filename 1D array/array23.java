import java.util.Scanner;

public class array23 {
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
        int maxindex=0;
        double thres=(double) avg*0.9;
        int count=0;
        int index[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<thres){
                count++;
                index[k]=i;
                k++;
            }
        }
        System.out.println("Production Lines : "+n);
        System.out.println("Total Output : "+sum+" units");
        System.out.printf("Average output : %.2f units/hour",avg);
        System.out.println();
        System.out.println("Top producer : Line "+(maxindex+1)+" ("+max+" units)");
        System.out.println("Underperforming  Lines : "+count);
        System.out.printf("Performance Threshold : %.2f units",thres);
        System.out.println();
        System.out.print("Priority Lines : [");
        for(int i=0;i<k;i++){
            System.out.print((index[i]+1)+" ");
        }
        System.out.print("]");
        sc.close();
    }
}
