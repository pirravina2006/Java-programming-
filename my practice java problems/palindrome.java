class palindrome{
    public static void main(String[] args) {
        int i=12321;
        int rev=0;
        int check=i;
        while(i!=0){
            int digit = i % 10;
            rev = (rev * 10) + digit;
            i=i/10;
        }
        if(rev==check){
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("It is not a palindrome number");
        }
    }
}
