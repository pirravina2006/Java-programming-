import java.util.Scanner;
public class array21 {
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
        double thres=avg*0.8;
        int count=0;
        int k=0;
        double index[]=new double[n];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
            if(arr[i]<thres){
                count++;
                index[k]=i;
                k++;
            }
        }

        System.out.println("Fleet size : "+n);
        System.out.printf("Average fuel efficiency : %.2f MPG",avg);
        System.out.println();
        System.out.println("Most Efficient : "+max+" MPG (Vehicle "+(maxindex+1)+")");
        System.out.println("Least Efficient : "+min+" MPG (Vehicle "+(minindex+1)+")");
        System.out.println("Underperforming Vehicles : "+count);
        System.out.printf("Efficiency threshold : %.2f MPG",thres);
        System.out.println();
        System.out.print("Maintenance Priority : [");
        for(int i=0;i<k;i++){
            System.out.print(index[i]+" ");
        }
        System.out.print("]");
        sc.close();
    }
}
