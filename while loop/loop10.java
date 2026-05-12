import java.util.Scanner;
public class loop10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fir=0;
        int sec=1;
        int sum=0;
        int i=0;
        while(i<n){
            System.out.print(fir+" ");
            sum=fir+sec;
            fir=sec;
            sec=sum;
            i++;
        }
        sc.close();
    }
}
