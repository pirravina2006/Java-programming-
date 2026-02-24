public class assignment {
    public static void main(String[]args){
        System.out.println(sub(50,30));
        System.out.println(mul(2,3));
        System.out.println(div(6,3));
        System.out.println(mod(10,20));
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static int mod(int a,int b){
        return a%b;
    }
}
