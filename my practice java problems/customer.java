class customer{
    String name;
    int id;
    String password;

    customer(String name,int id, String password){
        this.name=name;
        this.id=id;
        this.password=password;
    }


    public static void main(String[] args) {
        customer c=new customer("pirravina",2345,"aassddff");
        System.out.println(c.name);
        System.out.println(c.id);
        System.out.println(c.password);
    }
    
}