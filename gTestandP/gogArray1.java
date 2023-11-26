//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gogArray1{
	
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int s = sc.nextInt();
      
        int [] A  = new int[n];
        for(int i = 0 ; i < n;i++){
            A[i] = sc.nextInt();
        }
        

        // int n = 5;
        // int  s = 12;
        // int [] A = {1,2,3,7,5};
        
        int flag = 0 , start = 0 , sum = 0;


        for(int i = 0 ; i < n ; i ++){
           sum = sum + A[i];
           while(sum > s){
               sum = sum - A[start];
               start++;
           }
           if(sum == s){
               System.out.print((start+1)+" "+(i+1));
               flag = 1;
               break;
           }
            
        }
        if(flag == 0 ){
                System.out.print(-1);
         }
       
}
// } Driver Code Ends

}