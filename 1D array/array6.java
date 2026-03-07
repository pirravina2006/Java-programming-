import java.util.Scanner;
public class array6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n];
        double sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
            sum=sum+arr[i];
        }
        double avg=sum/n;
        double ther=avg*2;
        int k=0;
        int index[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>ther){
                if(arr[i]>avg){
                    count++;
                    index[k]=i;
                    k++;
                }
            }
        }
        System.out.println(count);
        for(int i=0;i<k;i++){
            System.out.print(index[i]+" ");
        }
        sc.close();
    }
}
