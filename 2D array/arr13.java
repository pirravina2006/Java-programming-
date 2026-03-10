import java.util.Scanner;
public class arr13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        int sum=0;
        int k=0;
        int row[]=new int[c];
        for(int i=0;i<r;i++){
            sum=0;
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    count++;
                }
                sum=sum+arr[i][j];
            }
            if(sum==0){
                row[k]=i;
                k++;
            }
        }
        int res=r*c;
        double per=(double)((double)count/res)*100;
        System.out.println("Total occupied : "+count);
        System.out.printf("Occupancy Rate : %.2f %%",per);
        System.out.println();
        System.out.print("Empty rows : [ ");
        for(int i=0;i<k;i++){
            System.out.print(row[i]+" ");
        }
        System.out.print("]");
        sc.close();
    }
}
