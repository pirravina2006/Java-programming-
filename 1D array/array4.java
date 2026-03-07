import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
        }
        float max=arr[0];
        float min=arr[0];
        float sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=-0.50 && arr[i]<=50.0){
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i]<min){
                    min=arr[i];
                }
                sum=sum+arr[i];
            }
        }
        float res=max-min;
        double avg=sum/n;
        System.out.println("Number of readings : "+n);
        System.out.printf("Maximum Temperature : %.2f",max," C");
        System.out.println();
        System.out.printf("Minimum Temperature : %.2f",min," C");
        System.out.println();
        System.out.printf("Temperature Range : %.2f",res," C");
        System.out.println();
        System.out.printf("Average Temperature : %.2f",avg," C");
        sc.close();
    }
}
