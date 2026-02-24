
import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number :  ");
		int a=sc.nextInt();
        System.out.print("Enter the second number :  ");
		int b=sc.nextInt();
        System.out.print("Enter the third number :  ");
		int c=sc.nextInt();
        int res=a+b+c;
        System.out.println("The sum of three numbers is : " + res);
        sc.close();

	}
	
}