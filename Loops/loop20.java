import java.util.Scanner;
public class loop20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double deposit=0;
        double with=0;
        double transfer=0;
        double  payment=0;
        for(int i=1;i<=n;i++){
            String transtype=sc.next();
            double amt=sc.nextDouble();
            String trans="";
            if(transtype.equals("Deposit")){
                trans="Credit";
                deposit=deposit+amt;
            }
            else if(transtype.equals("Withdrawal")){
                trans="Debit";
                with=with+amt;
            }
            else if(transtype.equals("Transfer")){
                trans="Debit";
                transfer=transfer+amt;
            }
            else if(transtype.equals("Payment")){
                trans="Debit";
                payment=payment+amt;
            }
            System.out.println("Transaction : "+transtype);
            System.out.println("Amount : $"+amt);
            System.out.println("Category : "+trans);
        }
        System.out.println("Total transactions : "+n);
        System.out.println("Total deposits : $"+deposit);
        System.out.println("Total withdrawals : $"+with);
        System.out.println("Total Transfers : $"+transfer);
        System.out.println("Total Payments : $"+payment);
        double finamt=deposit-(with+transfer+payment);
        System.out.println("Net Balance change : $"+finamt);
        sc.close();
    }
}
