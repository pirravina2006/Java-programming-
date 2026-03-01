import java.util.Scanner;
public class loop16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pass=0;
        int fail=0;
        double sum=0;
        double high=0;
        for(int i=1;i<=n;i++){
            String stdname=sc.next();
            int corans=sc.nextInt();
            int wrgans=sc.nextInt();
            int unatt=sc.nextInt();
            double score=(corans*4)-(wrgans*3)+(unatt*0);
            String sts="";
            if(score>=32){
                sts="Pass";
                pass++;
            }
            else{
                sts="Fail";
                fail++;
            }
            if(score>high){
                high=score;
            }
            sum=sum+score;
            System.out.println("Student : "+stdname);
            System.out.println("Correct : "+corans);
            System.out.println("Wrong answers : "+wrgans);
            System.out.println("Unattempted answers : "+unatt);
            System.out.println("Score : "+score);
            System.out.println("Result : "+sts);
        }
        double avg=sum/n;
        System.out.println("Total students : "+n);
        System.out.println("Pass count :"+pass);
        System.out.println("Fail count :"+fail);
        System.out.println("Class average :"+avg);
        System.out.println("Highest score : "+high);
        sc.close();
    }
}
