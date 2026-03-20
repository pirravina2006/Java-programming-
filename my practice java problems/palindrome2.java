public class palindrome2 {
    public static void main(String[] args) {
        int a=121;
        int rev=0;
        int b=a;
        while(a!=0){
            int digit=a%10;
            rev=(rev*10)+digit;
            a=a/10;
        }
        if(rev==b){
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("It is not a palindrome number");
        }
    }
}