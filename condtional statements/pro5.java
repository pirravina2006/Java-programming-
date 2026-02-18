import java.util.Scanner;
public class pro5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double gpa=sc.nextDouble();
        double income=sc.nextDouble();
        int score=sc.nextInt();
        String type=sc.next();
        String cate="";
        double amt=0.0;
        String eligi="";
        if(gpa>=2.5){
            if(type.equals("Merit")){
                if(gpa>=3.8 && score>=80){
                    cate="Full";
                    amt=25000;
                    eligi="Eligible";
                }
                else if(gpa>=3.5 && score>=70){
                    cate="Partial";
                    amt=15000;
                    eligi="Eligible";
                }
                else if(gpa>=3.0 && score>=60){
                    cate="Minimal";
                    amt=8000;
                    eligi="Eligible";
                }
                else{
                    amt=0;
                    eligi="Not-eligible";
                    cate="None";
                }
            }
            else if(type.equals("Need-Based")){
                if(gpa>=3.5 && income<=30000){
                    cate="Full";
                    amt=30000;
                    eligi="Eligible";
                }
                else if(gpa>=3.0 && income<=50000){
                    cate="Partial";
                    amt=18000;
                    eligi="Eligible";
                }
                else if(gpa>=2.8 && income<=70000){
                    cate="Minimal";
                    amt=10000;
                    eligi="Eligible";
                }
                else{
                    amt=0;
                    eligi="Not-eligible";
                    cate="None";
                }
            }
            else if(type.equals("Sports")){
                if(gpa>=3.0 && score>=85){
                    cate="Full";
                    amt=22000;
                    eligi="Eligible";
                }
                else if(gpa>=2.8 && score>=75){
                    cate="Partial";
                    amt=20000;
                    eligi="Eligible";
                }
                else if(gpa>=2.5 && score>=65){
                    cate="Minimal";
                    amt=12000;
                    eligi="Eligible";
                }
                else{
                    amt=0;
                    eligi="Not-eligible";
                    cate="None";
                }
            }
            System.out.println("GPA : "+gpa);
            System.out.println("Family Income : $"+income);
            System.out.println("Extracurricular Score : "+score);
            System.out.println("Scholarship type : "+type);
            System.out.println("Eligibility : "+eligi);
            System.out.println("Award Amount : $"+amt);
            System.out.println("Award Category : "+cate);
        }
        sc.close();
    }
}
