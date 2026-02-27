class parameter{
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void sub(int a,int b){
        System.out.println(a-b);
    }
    public static void mul(int a,int b){
        System.out.println(a*b);
    }
    public static void div(int a,int b){
        System.out.println(a/b);
    }

}
public static void main(String[]args){
    parameter.add(10,20);
    parameter.sub(40,20);
    parameter.mul(10,6);
    parameter.div(100,50);
}