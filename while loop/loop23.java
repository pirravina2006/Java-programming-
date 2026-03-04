import java.util.Scanner;
public class loop23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        int i=0;
        do{
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
            i++;
        }while(i<str.length());
        System.out.println(count);
        sc.close();
    }
}

// import java.util.Scanner;
// public class loop23 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         int count=0;
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'||
//                 ch=='a' ||ch=='e' ||ch=='i'||ch=='o'||ch=='u')
//             {
//                 count++;
//             }
//         }
//         System.out.println();
//         System.out.println("Text : "+str);
//         System.out.println("Vowel count : "+count);
//         sc.close();
//     }
// }
