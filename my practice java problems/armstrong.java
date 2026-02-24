public class armstrong {
    public static void main(String[] args) {
        int i=153;
        int fac=0;
        int num=i;
        while(i!=0){
            int rem=i%10;
            fac=fac+(rem*rem*rem);
            i=i/10;
        }
        if(fac==num){
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It  is not an Armstrong number.");
        }
    }
}
