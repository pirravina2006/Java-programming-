import java.util.Scanner;
public class loop13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int pow=sc.nextInt();
        int i=1;
        int res=1;
        while(i>=1 && i<=pow){
            res=res*base;
            i++;
        }
        System.out.println(base+" ^ "+pow+" = "+res);
        sc.close();
    }
}
