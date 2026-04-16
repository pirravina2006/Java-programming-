import java.util.Scanner;
import java.lang.String;
public class array12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        System.out.println("Daily Limit : ");
        double limit=sc.nextDouble();
        double max=arr[0];
        int maxindex=0;
        double sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            sum=sum+arr[i];
        }
        String status="";
        double avg=sum/n;
        System.out.println("Hours Monitored : "+n);
        System.out.printf("Total daily consumption : %.2f",sum," kWh");
        System.out.println();
        System.out.println("Peak hour : Hour "+(maxindex+1)+"("+max+" kWh)");
        System.out.printf("Average Hourly : %.2f",avg," kWh");
        System.out.println();
        System.out.println("Daily limit : "+limit+" kWh");
        if(sum>limit){
            double res=sum-limit;
            status="Limit Exceeded";
            System.out.println("Status :"+status+" "+res+" kWh");
        }else{
            status="Within Limit";
            System.out.println("Status : "+status);
        }
        sc.close();
    }
}
