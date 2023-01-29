// // Saurav and his friend playing cards. Both are going to pick four cards from the deck and show the cards. If anyone got higher number of even or odd number cards then he will win the game. Write a program to check who wins the game or game get tie.

// // Input Format

// // First line shows four space separated values of four cards picked by Saurav.
// // Second line will contain four space separated values of four cards picked by Saurav's Friend.

// // Constraints

// // Values will be between 1-13

// // Output Format

// // Output will be Saurav Won or Saurav Lost or Tie


// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class day3 {

//     public static void main(String[] args) {
         
//         int[] a={0,0,0,0};
//         int[] b={0,0,0,0};
//         int odd=0,even=0,odd1=0,even1=0;
       
//         int flag =0;
        
//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<4;i++){
//             int x = sc.nextInt();
//             if(x>13)flag=1;
//             a[i]= x;
//         }
//         for(int i=0;i<4;i++){
//             int y = sc.nextInt();
//             if(y>13)flag=1;
//             b[i]=y;
//         }
        
//         for(int i=0;i<4;i++){
//             if(a[i]%2==0)even++;
//             else odd++;
//         }
        
//         for(int i=0;i<4;i++){
//             if(b[i]%2==0)even1++;
//             else odd1++;
//         }
        
//         int cmp = Math.max(even,odd);
//         int cmp2 = Math.max(even1,odd1);
        
//         if(flag==1)System.out.println("Invalid Input");
//         else if (cmp==cmp2)System.out.println("Tie");
//         else if (cmp<cmp2)System.out.println("Saurav Lost");
//         else System.out.println("Saurav Won");
        
        
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }





// // ====================================================================================

// // Akash got an assignment where he need to determine whether a given integer N is perfect square or not. Write a java programming solution to help akash.

// // Input Format

// // First Line contain integer N

// // Constraints

// // N>1 & N<1000

// // Output Format

// // Return "Perfect Square" incase integer is a perfect square or return "Not Perfect Square" incase it is not.

// import java.util.Scanner;


// public class day3 {

//     public static boolean isPerfectSquare(int x)
//     {
//         if (x >= 0) {
        
            
//             int sr = (int)Math.sqrt(x);
        
//            return ((sr * sr) == x);
//         }
//         return false;
//     }

    
// public static void main(String[] args)
//     {
//         Scanner s=new Scanner(System.in);
//         int x=s.nextInt();

//         if (isPerfectSquare(x))
//             System.out.print("Perfect Square");
//         else
//             System.out.print("Not Perfect Square");
//     }
// }