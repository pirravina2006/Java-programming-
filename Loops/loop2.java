import java.util.Scanner;
// import java.math.*;
public class loop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        int cp=0;
        int cf=0;
        int max=0;
        for(int i=1;i<=n;i++){
            String stdname=sc.next();
            int sco=sc.nextInt();
            char grade;
            if(sco>=85 && sco<=100){
                grade='A';
            }
            else if(sco>=70 && sco<=84){
                grade='B';
            }
            else if(sco>=60 && sco<=69){
                grade='C';
            }
            else if(sco>=50 && sco<=59){
                grade='D';
            }
            else{
                grade='F';
            }
            String status="";
            if(sco>=60){
                status="Pass";
                cp++;
            }
            else{
                status="Fail";
                cf++;
            }
            sum=sum+sco;
            max=Math.max(max, sco);
            System.out.println("Student  : "+stdname);
            System.out.println("Score : "+sco);
            System.out.println("Letter grade : "+grade);
            System.out.println("Status : "+status);
        }
        double avg=sum/n;
        System.out.println("\n");
        System.out.println("Total Students : "+n);
        System.out.printf("Class Average : %.2f",avg);
        System.out.println("\n");
        System.out.println("Highest score : "+max);
        System.out.println("Students passed : "+cp);
        System.out.println("Students failed : "+cf);
        sc.close();
    }
}
