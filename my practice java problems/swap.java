class swap{
    public static void main(String[]args){
        int a=5;
        int b=10;
        int temp=0;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " +b);
    }
}
