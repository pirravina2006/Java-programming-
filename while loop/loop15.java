// do while loop collatz sequence
import java.util.Scanner;
public class loop15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        System.out.println("Collatz sequence starting from "+n);
        do{
            if(n==1){
                break;
            }
            System.out.print(n+" ");
            if(n%2==0){
                n=n/2;
            }
            else{
                n=(3*n)+1;
            }
            count++;
        }while(n!=1);
        System.out.print(1);
        System.out.println("\nSteps : "+count);
        sc.close();
    }
}

// while loop collatz sequence
// import java.util.Scanner;
// public class loop15 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int count=0;
//         while(n!=1){
//             System.out.print(n+" ");
//             if(n%2==0){
//                 n=n/2;
//             }
//             else{
//                 n=3*n+1;
//             }
//             count++;
//         }
//         System.out.print(1);
//         System.out.println("\nSteps : "+count);
//         sc.close();
//     }
// }
