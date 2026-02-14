import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum1=0;
        int mid=n/2;
        for(int i=0;i<=mid;i++){
            sum1=sum1+arr[i];
        }
        int sum2=0;
        for(int i=mid+1;i<n;i++){
            sum2=sum2+arr[i];
        }
        int dif=sum1-sum2;
        System.out.println(dif);
    }
}
