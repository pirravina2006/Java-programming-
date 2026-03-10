import java.util.Scanner;
public class arr12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][7];
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                arr[i][j]=sc.nextInt()*10;
            }
        }
        int sum=0;
        System.out.println("Rainfall Data : ");
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int tot=0;
        int min=300;
        int minindex=0;
        System.out.println("Weekly Totals : ");
        for(int i=0;i<4;i++){
            sum=0;
            for(int j=0;j<7;j++){
                sum=sum+arr[i][j];
            }
            if(sum<min){
                min=sum;
                minindex=i;
            }
            tot=tot+sum;
            System.out.print("Week "+(i+1)+" : "+sum+" mm");
            System.out.println();
        }
        System.out.println("Monthly Total : "+tot);
        System.out.println("Driest Week : Week "+(minindex+1)+" ("+min+" mm)");
        sc.close();
    }
}
