import java.util.Scanner;
public class loop7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        int res=0;
        do{
            System.out.println("Calculator Menu :");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
            choice=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            switch (choice) {
                case 1:
                    res=a+b;
                    System.out.println("Choice : "+choice);
                    System.out.println("Result : "+res);
                    break;
                case 2:
                    res=a-b;
                    System.out.println("Choice : "+choice);
                    System.out.println("Result : "+res);
                    break;
                case 3:
                    res=a*b;
                    System.out.println("Choice : "+choice);
                    System.out.println("Result : "+res);
                    break;
                case 4:
                    res=a/b;
                    System.out.println("Choice : "+choice);
                    System.out.println("Result : "+res);
                    break;
                case 5:
                    System.out.println("Choice : "+choice);
                    System.out.println("Good bye");
                    break;
            }
        }while(choice!=5);
        sc.close();
    }
}
