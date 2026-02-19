import java.util.Scanner;
public class pro8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tier=sc.next();
        int sqfo=sc.nextInt();
        int age=sc.nextInt();
        int score=sc.nextInt();
        double base=0;
        double adj=0;
        double bon=0;
        if(tier.equals("Prime")){
            base=400;
        }
        else if(tier.equals("Urban")){
            base=300;
        }
        else if(tier.equals("Suburban")){
            base=180;
        }
        else if(tier.equals("Rural")){
            base=100;
        }
        if(age>0 && age<=5){
            adj=0;
        }
        else if(age>=6 && age<=15){
            adj=-5;
        }
        else if(age>=16 && age<=30){
            adj=-15;
        }
        else if(age>=31 && age<=100){
            adj=-25;
        }
        if(score>=80 && score<=100){
            bon=base*(10/100);
        }
        else if(score>=60 && score<=79){
            bon=base*(5/100);
        }
        else if(score>=40 && score<=59){
            bon=base*(2/100);
        }
        else if(score<40){
            bon=0;
        }
        double baval=sqfo*base;
        double adjval=base*(1+age/100);
        double finval=adjval+base*(bon/100);
        String mar="";
        if((tier.equals("Prime") || tier.equals("Urban")) || age<15){
            mar="Hot";
        }
        else if(tier.equals("Suburban")){
            mar="Stable";
        }
        else if(tier.equals("Rural") || age>30){
            mar="Slow";
        }

        System.out.println("Location Tier : "+tier);
        System.out.println("Square Footage : "+sqfo +"sq ft");
        System.out.println("Property Age : "+age +" years");
        System.out.println("Amenity Score : "+score);
        System.out.println("Base price per sq feet : $"+base);
        System.out.println("Age adjustment : %"+adj);
        System.out.println("Amenity Bonus : $"+baval);
        System.out.println("Estimated Square value : $"+finval);
        System.out.println("Market category : "+mar);
        sc.close();
    }
}