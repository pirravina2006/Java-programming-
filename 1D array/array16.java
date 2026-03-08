import java.util.Scanner;
public class array16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            sum=sum+arr[i];
        }
        long avg=(long)sum/n;
        long max=arr[0];
        int maxindex=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        double thres=avg*1.5;
        int count=0;
        int k=0;
        long index[]=new long[n];
        for(int i=0;i<n;i++){
            if(arr[i]>thres){
                count++;
                index[k]=i;
                k++;
            }
        }
        System.out.println("Trading Days Analyzed : "+n);
        System.out.println("Total Volume : "+sum);
        System.out.println("Average daily volume : "+avg);
        System.out.println("Peak volume day : Day "+(maxindex+1)+" ("+max+")");
        System.out.println("High volume Days (>150% avg) : "+count);
        System.out.print("[ ");
        for(int i=0;i<k;i++){
            System.out.print(index[i]+" ");
        }
        System.out.print("]");
        sc.close();
    }
}
