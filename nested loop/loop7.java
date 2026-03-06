// import java.util.Scanner;
// public class loop7 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 if(j%2==0){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }
import java.util.Scanner;
import java.lang.String;
public class loop7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int sum=0;
		double avg=0;
		for(int i=0;i<r;i++) {
			String str=sc.next();
			System.out.print(str+" ");
			for(int j=0;j<c;j++) {
				int mark=sc.nextInt();
				System.out.print(mark+" ");
				sum=sum+mark;
			}
			avg=sum/c;
			System.out.print(avg);
			System.out.println();
		}
		sc.close();
	}
}