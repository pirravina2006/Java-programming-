import java.util.Scanner;
public class array17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        double sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];
        }
        double avg=(double)sum/n;
        double max=arr[0];
        double min=arr[0];
        int count=0;
        int k=0;
        int index[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]<6.5 || arr[i]>8.5){
                count++;
                index[k]=i;
                k++;
            }
        }
        double per=(double)((n-count)/n)*100;
        System.out.println("Total samples : "+n);
        System.out.println("Average pH : "+avg);
        System.out.println("Minimum pH : "+min);
        System.out.println("Maximum pH : "+max);
        System.out.println("Unsafe samples : "+count);
        System.out.printf("Safety compliance : %.2f %%",per);
        System.out.println();
        System.out.print("[");
        for(int i=0;i<k;i++){
            System.out.print((index[i]+1)+" ");
        }
        System.out.print("]");
        sc.close();
    }
}
