import java.util.Scanner;
public class arr15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][];
        int count=0;
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            arr[i]=new int[s];
            for(int j=0;j<s;j++){
                arr[i][j]=sc.nextInt();
                count++;
            }
        }
        System.out.println("Employee Contact Book :");
        for(int i=0;i<n;i++){
            System.out.print("Dept "+(i+1)+" : ");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Total Employees : "+count);
        sc.close();
    }
}
