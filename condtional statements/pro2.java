import java.util.Scanner;
public class pro2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int credit=sc.nextInt();
        double income=sc.nextDouble();
        double ratio=sc.nextDouble();
        String type=sc.next();
        String cate="";
        String deot="";
        String status="Approved";
        double amt=0;
        if(credit>=650){
            if(credit>=750){
                cate="Excellent";
            }
            else if(credit>=700){
                cate="Good";
            }
            else if(credit>=650){
                cate="Fair";
            }
            else{
                cate="Poor";
            }
            if(ratio<=30){
                deot="Low";
            }
            else if(ratio>=31 && ratio<=40){
                deot="Moderate";
            }
            else if(ratio>40){
                deot="High";
            }
            if(type.equals("Home")){
                if(cate.equals("Excellent") && deot.equals("Low")){
                    status="Approved";
                    amt=4*income;
                }
                else if(cate.equals("Good") && deot.equals("Moderate")){
                    status="Need Review";
                    amt=3*income;
                }
                else{
                    status="Rejected";
                }
            }
            else if(type.equals("Personal")){
                if(cate.equals("Excellent") && deot.equals("Low")){
                    status="Approved";
                    amt=1*income;
                }
                else if(cate.equals("Good") && deot.equals("Moderate")){
                    status="Approved";
                    amt=0.5*income;
                }
                else{
                    status="Rejected";
                }
            }
            else if(type.equals("Business")){
                if((cate.equals("Excellent") || cate.equals("Good")) && (deot.equals("Low") ||(deot.equals("Moderate")))){
                    status="Approved";
                    amt=3*income;
                }
                else{
                    status="Rejected";
                }
            }
            System.out.println("Credit score : "+credit);
            System.out.println("Annual income : $"+income);
            System.out.println("Debt-income ratio : "+ratio +"%");
            System.out.println("Loan type : "+type);
            System.out.println("Decision : "+status);
            System.out.println("Maximum loan amount : $"+amt);
        }
        else{
            status="Rejected";
            System.out.println("Credit score : "+credit);
            System.out.println("Annual income : $"+income);
            System.out.println("Debt-income ratio : "+ratio +"%");
            System.out.println("Loan type : "+type);
            System.out.println("Decision : "+status);
            System.out.println("Maximum loan amount : $"+amt);
        }

        sc.close();
    }
}
