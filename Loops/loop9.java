import java.util.Scanner;
public class loop9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int cal=0;
        for(int i=1;i<=n;i++){
            String extype=sc.next();
            int dumin=sc.nextInt();
            int calbun=0;
            String intensity="";
            if(extype.equals("Running")){
                calbun=10*dumin;
                intensity="High intensity";
            }
            else if(extype.equals("Swimming")){
                calbun=12*dumin;
                intensity="High intensity";
            }
            else if(extype.equals("Cycling")){
                calbun=8*dumin;
                intensity="Moderate intensity";
            }
            else if(extype.equals("Gym")){
                calbun=7*dumin;
                intensity="Moderate intensity";
            }
            else if(extype.equals("Walking")){
                calbun=4*dumin;
                intensity="Low intensity";
            }
            sum=sum+dumin;
            cal=cal+calbun;
            System.out.println("Session "+i+" :"+extype);
            System.out.println("Duration : "+dumin);
            System.out.println("Calories burned : "+calbun);
            System.out.println("Intensity : "+intensity);
        }
        System.out.println("Total Workouts : "+n);
        System.out.println("Total duration : "+sum);
        System.out.println("Total calories burned : "+cal);
        double avg=cal/n;
        System.out.println("Average calories per session : "+avg);
        String fitlev="";
        if(cal<300){
            fitlev="Beginner";
        }
        else if(cal>=300 && cal<=1000){
            fitlev="Intermediate";
        }
        else if(cal>1000){
            fitlev="Advanced";
        }
        System.out.println("Fitness level : "+fitlev);
        sc.close();
    }
}
