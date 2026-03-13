import java.util.Scanner;
public class array7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
                sum=sum+arr[i][j];
            }
        }
        int max=arr[0][0];
        int colindex=0;
        int rowindex=0;
        System.out.println("Inventory Grid : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]>max){
                    max=arr[i][j];
                    rowindex=i;
                    colindex=j;
                }
            }
            System.out.println();
        }
        System.out.println();
        double avg=(double)sum/(double)(r*c);
        System.out.println("Total Inventory : "+sum);
        System.out.println("Max Stock Zone : Row "+rowindex+" , Col "+colindex+" ("+max+" units)");
        System.out.printf("Average Stock per Zone : %.2f",avg);
        sc.close();
    }
}
