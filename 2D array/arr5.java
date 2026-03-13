import java.util.Scanner;
public class array5 {
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
        double sum=0;
        System.out.println("Temperature Grid : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
                sum=sum+arr[i][j];
            }
            System.out.println();
        }
        double avg=(double)sum/(double)(r*c);
        int max=0;
        int min=0;
        int maxindex1=0;
        int maxindex2=0;
        int minindex1=arr[0][0];
        int minindex2=arr[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                    maxindex1=i;
                    maxindex2=j;
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                    minindex1=i;
                    minindex2=j;
                }
            }
        }
        System.out.println("Maximum Temperature : "+max+" C at position ("+(maxindex1)+","+(maxindex2)+")");
        System.out.println("Minimum Temperature : "+min+" C at position ("+(minindex1)+","+(minindex2)+")");
        System.out.printf("Average Temperature : %.2f C",avg);
        sc.close();
    }
}
