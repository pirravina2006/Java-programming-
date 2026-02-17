import java.util.Scanner;
public class pro1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int perf=sc.nextInt();
        int ser=sc.nextInt();
        String str=sc.next();
        double sal=sc.nextDouble();
        double bon=0.0;
        if(perf>=3){
            if((str.equals("critical") || str.equals("Critical")) && perf>=3){
                if(perf==5 && ser>=5){
                    bon=25.0;
                    sal=sal*(bon/100);
                }
                else if(perf==4 && ser>=10){
                    bon=22.0;
                    sal=sal*(bon/100);
                }
                else if(perf==4){
                    bon=15.0;
                    sal=sal*(bon/100);
                }
                else{
                    bon=10.0;
                    sal=sal*(bon/100);
                }
            }
            else if((str.equals("non-critical") || str.equals("Non-critical" ))&& perf>=3){
                if(perf==5){
                    bon=18.0;
                    sal=sal*(bon/100);
                }
                else if(perf==4){
                    bon=12.0;
                    sal=sal*(bon/100);
                }
                else{
                    bon=8.0;
                    sal=sal*(bon/100);
                }
            }
            System.out.println("Performance rating : "+perf);
            System.out.println("Years of service : "+ser);
            System.out.println("Department : "+str);
            System.out.println("Bonus Percentage : "+bon+"%");
            System.out.println("Bonus Amount : $"+sal);
            System.out.println("Status : Eligible");
        }
        else{
            bon=0;
            sal=0;
            System.out.println("Performance rating : "+perf);
            System.out.println("Years of service : "+ser);
            System.out.println("Department : "+str);
            System.out.println("Bonus Percentage : "+bon+"%");
            System.out.println("Bonus Amount : $"+sal);
            System.out.println("Status :Not Eligible");
        }
        sc.close();
    }
}