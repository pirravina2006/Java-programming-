import java.util.Scanner;

public class array25 {
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
        int min=arr[0];
        int minindex=0;
        double thres=(double) avg*2.0;
        int count=0;
        int index[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
            if(arr[i]>thres){
                count++;
                index[k]=i;
                k++;
            }
        }
        System.out.println("Security Events Analyzed : "+n);
        System.out.printf("Average Risk Score : %.2f",avg);
        System.out.println();
        System.out.println("Highest risk event : "+(max)+" (Event "+(maxindex+1)+")");
        System.out.println("Lowest risk event : "+min+" (Event "+(minindex+1)+")");
        System.out.println("Critical Threats(>200% avg) : "+count);
        System.out.printf("Threat Threshold : %.2f",thres);
        System.out.println();
        System.out.print("Alert Events : [");
        for(int i=0;i<k;i++){
            System.out.print((index[i]+1)+" ");
        }
        System.out.print("]");
        sc.close();
    }
}

