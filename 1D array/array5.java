import java.util.Scanner;
public class array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        if(n>=2 && n<=1000){
            double sum=0;
            double max=arr[0];
            double min=arr[0];
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i]<min){
                    min=arr[i];
                }
                sum=sum+arr[i];
            }
            System.out.println("Number of sellers : "+n);
            System.out.printf("Lowest price : $%.2f",min);
            System.out.println();
            System.out.printf("Highest Price : $%.2f",max);
            System.out.println();
            double diff=max-min;
            System.out.printf("Price difference : $%.2f",diff);
            System.out.println();
            double sav=(diff/max)*100;
            System.out.printf("Savings Percentage : %.2f%%",sav);
        }
        sc.close();
    }
}
