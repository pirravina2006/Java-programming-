import java.util.Scanner;
public class array11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n];
        float b[]=new float[n];
        System.out.println("Array 1 :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array 2 :");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        float pro[]=new float[n];
        for(int i=0;i<n;i++){
            pro[i]=arr[i]*b[i];
        }
        double sum=0;
        int maxindex=0;
        float max=pro[0];
        int minindex=0;
        float min=pro[0];
        for(int i=0;i<n;i++){
            if(pro[i]>max){
                max=pro[i];
                maxindex=i;
            }
            if(pro[i]<min){
                min=pro[i];
                minindex=i;
            }
            sum=sum+pro[i];
        }
        System.out.println("Number of Assets : "+n);
        System.out.println("Total portfolio value : "+sum);
        System.out.println("Most valuable Asset : Asset "+(maxindex+1)+" ($"+max+")");
        System.out.println("Least valuable Asset : Asset "+(minindex+1)+" ($"+min+")");
        sc.close();
    }
}
