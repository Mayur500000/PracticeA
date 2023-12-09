package Loops;
import java.util.Random;
import java.util.Scanner;

public class loopsQ {

//Questions links - https://www.beginwithjava.com/java/loops/questions.html

//---------------------------------------------Question1
// public static void main(String[] args) {
//     for (int i=1;i<=10;i++){
//         System.out.println(i);
//     }
// }

//---------------------------------------------Question2
// public static void main(String[] args) {
//     int n =10;
//     int a = n*(n+1)/2;
//     int sum=0;
// System.out.println(a);
// //with loop
// for(int i = 1; i<=10;i++){
//     sum +=i;
// }
// System.out.println(sum);
// }

//--------------------------------------------Question3
// public static void main(String[] args) {
//     int n =5;
//     int sum=1;
// for(int i = 1; i<=10;i++){
//     sum = n*i;
//     System.out.println(sum);
// }
// }
    
//--------Qustion 13
// public static int countN(int a){
//     int count = 0;
//      while(a!=0){
     
//       count ++;
//        a/=10;
//    }
//     return count;
// }
// public static void main(String[] args) {
//    int a= 153;
//    int oga= 153;
//    int count = countN(a);;
 
//    int sum=0;
 
  
//    //System.out.println(a);
//     while(a!=0){
//     int d = a%10;
//     int temp = 1;
//     //System.out.println(d);
//     for(int i = 1;i<=count;i++){
//      temp =d * temp; 
 
//    }
//    sum +=temp; 
    
//    a/=10;
// }
// System.out.println(sum);
// System.out.println(oga);
// if(sum==oga){
//     System.out.println("A");
// }
// else{
//     System.out.println("NA");
// } 
// }

//--------------------------------Question 14
// public static void main(String[] args) {
     
//     int a= 0;
//     int b= 1;
//     int c;
//     int n = 10;
     
//      System.out.println(a);
//      System.out.println(b);
     
//      for(int i = 3;i<=n;i++){
//        c = a+b;
//        System.out.println(c);
//        a =b;
//        b=c;
//      }
//  }

//--------------------------------Question15

    // public static void main(String[] args) {
    //  double n = 5;
    //  double a = 1;
    //  double op=0;
   
    // for(double i = 1;i<=n;i++){
    //      op += a/i;       
    //      System.out.println(op);         
    // }
    // }

//--------------------------------Question16
// public static void main(String[] args) {
//     double n = 5;
//     double a = 1;
//     int sign = 1;
//     double sum=0;
  
//    for(double i = 1;i<=n;i++){
//         sum +=(a*sign)/i;
//         sign *=-1;
//    }
//          System.out.println(sum);
//    }


//--------------------------------Question17
    // public static void main(String[] args) {
    //       Random rand = new Random();
    //       Scanner sc = new Scanner(System.in);
    //         int a = rand.nextInt(100);
    //           System.out.println(a);
           
    //           boolean flag = true;
    //           while(flag==true){
              
    //           System.out.println("Guess no below 100 \n");
    //           int b = sc.nextInt();
    //           if(b>a){
    //               System.out.println("lesser \n");
    //              flag= true;
    //           }
    //           else if(b<a){
    //               System.out.println("higher \n");
    //               flag=true;
    //           }
    //           else if(b==a){
    //               System.out.println("correct \n");
    //              flag=false;
    //           }
    //           else{
    //               System.out.println("invalide \n");
    //              flag= true;
    //           }
    //         }    
    // }


}
