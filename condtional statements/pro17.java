import java.util.Scanner;
public class pro17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cardtier=sc.next();
        String purcat=sc.next();
        double tranamt=sc.nextDouble();
        String promsts=sc.next();
        double baserate=0;
        if(cardtier.equals("Basic") || cardtier.equals("Gold") ||cardtier.equals("Platinum")||cardtier.equals("Black")){
            baserate=1.0;
        }
        double catbon=0;
        if(purcat.equals("Groceries")){
            catbon=2.0;
        }
        else if(purcat.equals("Dining")){
            catbon=2.5;
        }
        else if(purcat.equals("Travel")){
            catbon=3.0;
        }
        else if(purcat.equals("Gas")){
            catbon=2.0;
        }
        else if(purcat.equals("Others")){
            catbon=1.0;
        }
        double tiermul=0;
        if(cardtier.equals("Basic")){
            tiermul=1.0;
        }
        else if(cardtier.equals("Gold")){
            tiermul=1.25;
        }
        else if(cardtier.equals("Platinum")){
            tiermul=1.5;
        }
        else if(cardtier.equals("Black")){
            tiermul=2.0;
        }
        double promul=0;
        if(promsts.equals("None")){
            promul=1.0;
        }
        else if(promsts.equals("Double-points")){
            promul=2.0;
        }
        else if(promsts.equals("Triple-points")){
            promul=3.0;
        }
        double points=tranamt*baserate*catbon*tiermul*promul;
        double cashvalue=points*0.01;
        String reatier="";
        if(cardtier.equals("Basic")){
            reatier="Standard";
        }
        else if(cardtier.equals("Gold")){
            reatier="Enhanced";
        }
        else if(cardtier.equals("Platinum")){
            reatier="Premium";
        }
        else if(cardtier.equals("Black")){
            reatier="Elite";
        }

        System.out.println("Card tier : "+cardtier);
        System.out.println("Purchase category : "+purcat);
        System.out.println("Transaction Amount : $"+tranamt);
        System.out.println("Promotional Status : "+promsts);
        System.out.println("Base point rate : "+baserate+" points per dollar");
        System.out.println("Category bonus : "+catbon+"x");
        System.out.println("Tier multiplier : "+tiermul+"x");
        System.out.println("Promotional multiplier : "+promul+"x");
        System.out.println("Points earned : "+points);
        System.out.println("Equivalent cash value : "+cashvalue);
        System.out.println("Rewards tier : "+reatier);
        sc.close();
    }
}
