// import java.util.Scanner;
// public class loop25 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         // for(int i=1;i<=n;i++){
//         //     for(int j=1;j<=i;j++){
//         //         System.out.print(i+" ");
//         //     }
//         //     System.out.println();
//         // }

//         // int i=1;
//         // int j=1;
//         // while (i<=n) {
//         //     while (j<=i) {
//         //         System.out.print(i+" ");
//         //         j++;
//         //     }
//         //     i++;
//         //     System.out.println();
//         // }

//         // int i=1;
//         // int j=1;
//         // while(i<=n){
//         //     for(j=1;j<=i;j++){
//         //         System.out.print(i+" ");
//         //     }
//         //     System.out.println();
//         //     i++;
//         // }

//         int i=1;
//         int j=1;
//         do{
//             j=1;
//             do{
//                 System.out.print(i+" ");
//                 j++;
//             }
//             while(j<=i);
//             System.out.println();
//             i++;
//         }
//         while(i<=n);
//         sc.close();
//     }
// }



import java.util.Scanner;
public class loop25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int j=1;
        do{
            j=1;
            do{
                System.out.print(i+" ");
                j++;
            }while(j<=i);
            System.out.println();
            i++;
        }while(i<=n);
        sc.close();
    }
}