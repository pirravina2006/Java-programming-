public class strong {
    public static void main(String[] args) {
        int num = 145;
        int sum=0;
        int alt=num;
        while(num!=0) {
            int rem = num % 10;
            int fact=1;
            for(int i=1; i<=rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        System.out.println("sum of digits is:"+sum);
        if(sum==alt){
            System.out.println("The number is a strong number");
        } else {
            System.out.println("The number is not a strong number");
        }
    }
}
