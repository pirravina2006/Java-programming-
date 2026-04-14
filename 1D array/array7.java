//pending
import java.util.Scanner;
public class array7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int thres=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int k=0;
        int index[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>thres){
                count++;
                index[k]=i;
                k++;
            }
        }
        System.out.println("Production lines : "+n);
        System.out.println("Acceptable Threshold : "+thres);
        System.out.println("Lines exceeding threshold : "+count+1);
        System.out.println("Critical lines : ");
        for(int i=0;i<k;i++){
            System.out.print(index[i]+" ");
        }
        System.out.println();
        double val=(double)(n-count)/n;
        double per=val*100;
        System.out.println("Compliance rate : "+per);
        sc.close();
    }
}
