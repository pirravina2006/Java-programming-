import java.util.Scanner;
public class loop18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int temp2=n1;
        int temp3=n2;
        while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        int res=(temp2*temp3)/n1;
        System.out.println(res);
        sc.close();
    }
}
