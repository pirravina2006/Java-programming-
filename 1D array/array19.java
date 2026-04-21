import java.util.Scanner;
public class array19{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int tar=sc.nextInt();
        double avg=(double)sum/n;
        int max=arr[0];
        int maxindex=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i+1;
            }
            if(arr[i]<tar){
                count++;
            }
        }
        double per=((double)(n-count)/n)*100;
        System.out.println("Days Tracked : "+n);
        System.out.println("Total calories burned : "+sum);
        System.out.printf("Average Daily Burn : %.2f",avg);
        System.out.println();
        System.out.println("Peak Bur day : Day "+maxindex+"( "+max+" calories)");
        System.out.println("Days below Target : "+count);
        System.out.printf("Goal Achievement : %.2f %%",per);
        sc.close();
    }
}