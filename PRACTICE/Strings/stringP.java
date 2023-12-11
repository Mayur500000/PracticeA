package Strings;

import java.util.Arrays;

public class stringP {

    //-----------------------------------------Question1
    // public static void main(String[] args) {
    //  String s = "abcdef";
    //  int n = s.length();
    //  for(int i =n;i>0 ;i--){
    //     System.err.print(s.charAt(i-1));
    //  }
    // }

    //-----------------------------------------Question2
    // public static void main(String[] args) {
    //     String a = "silent";
    //     String b = "listen";
    //     boolean flag = true;
    //     char[] s1 = a.toCharArray();
    //     char[] s2 = b.toCharArray();
    //     Arrays.sort(s1);
    //     Arrays.sort(s2);
    //     flag =Arrays.equals(s1, s2);
    //     System.out.println(flag);
    // }

    //-----------------------------------------Question3
    //   public static void main(String[] args) {
    //     String s = "abcdabc";//aaaabbccd
    //     char []s1 = s.toCharArray();
    //     Arrays.sort(s1);
    //     System.out.println(s1);
    //     int n = s.length();
    //     for(int i = 0 ; i < n;i++){
    //          int count =1;
    //          while (i < n - 1 && s1[i] == s1[i + 1]) {
    //             count++;
    //             i++;
    //         }
    //          System.out.println(s1[i]+" : "+count);  
    //     }
    // }

    //----------------------------------------Question4
//     public static void main(String[] args) {
//         String s = "lksdjfhalkdsf"; 
//         char[] s1 = s.toCharArray();
//         System.out.println(s1);
//         Arrays.sort(s1);
//         int n = s.length();
//         char[] s2 = new char[n];
//         int j = 0;
    
//         for (int i = 0; i < n; i++) {
//             s2[j++] = s1[i];
//             while (i < n - 1 && s1[i] == s1[i + 1]) {
//                 i++; 
//             }
//     }
// }
}
