import java.util.Scanner;
public class array2 {
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
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]<thres){
                b[k]=i;
                count++;
                k++;
            }
        }
        System.out.println("Total products : "+n);
        System.out.println("Minimum Threshold : "+thres);
        System.out.println("Low stock product : "+count);
        System.out.print("[");
        for(int i=0;i<k;i++){
            System.out.print(b[i]+" ");
        }
        System.out.print("]");
        sc.close();
    }
}
