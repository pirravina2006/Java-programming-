import java.util.Scanner;
public class array18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        float avg=(float)sum/n;
        int max=arr[0];
        int maxindex=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        double thres=(double) avg*0.5;
        int count=0;
        int index[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]<thres){
                count++;
                index[k]=i;
                k++;
            }
        }
        System.out.println("Total products : "+n);
        System.out.println("Total units sold: "+sum);
        System.out.printf("Average monthly sales : %.2f",avg);
        System.out.println();
        System.out.println("Best Seller : Product "+(maxindex+1)+"("+max+"units)");
        System.out.println("Slow moving products : "+count);
        System.out.printf("Turnover Threshold : %.2f units",thres);
        System.out.println();
        System.out.print("Clearance candidates : ");
        System.out.print("[ ");
        for(int i=0;i<k;i++){
            System.out.print((index[i])+" ");
        }
        System.out.print("]");
        sc.close();
    }
}
