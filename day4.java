// Akash got a assignment in which he has to identify whether given integer N is multiple of integer K or not. Write a java programming solution to help akash.

// Input Format

// First Line contain integer N
// Second Line contain integer K
// Constraints

// N>1 & N<1000
// K>1 & K<100
// Output Format

// Return "Multiple" incase it is multiple or "Not Multiple" incase it is not multiple.




// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner s=new Scanner(System.in);
//         int x=s.nextInt();
//         int y=s.nextInt();
//         if(x%y==0)
//         System.out.print("Multiple");
//         else
//          System.out.print("Not Multiple");


        
//     }
// }


// ==================================================================================================


// Shruti is running a jewellery shop. She got calls from her customers to know the current price of silver and gold in different weights. Write a program to help Shruti to calculate price in the different weights when Shruti knows the weight of 1 Kg. Silver and 10 gm. Gold.

// Input Format

// First line will contain a number representing 1Kg. Silver price.
// Second line will contain a number representing 10gm. Gold Price.
// Third Line will contain a String value Silver/Gold representing user input to know the price.
// Fourth line will contain weight of silver/gold in grams for which user want price.

// Constraints

// Price cannot be -ve and maximum can be 1000000.
// Weights entered by user can be between 0.01 gm to 1000 gms.

// Output Format

// One number representing value of gold/silver asked by user for a particular weight.


// import java.util.Scanner;

// public class Solution {

//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//         float silverra = s.nextFloat();
//         float goldra = s.nextFloat();
//         s.nextLine(); 
//         String st = s.nextLine();
//         float n = s.nextFloat();
//         if(silverra>0&&silverra<=1000000&&goldra>0&&goldra<=1000000&&n>=0.01f&&n<=1000f){
//             if(st.equalsIgnoreCase("Silver")){
//                 int pp1 = (int)((n/1000)*silverra);
//                 System.out.println(pp1);
//             }
//             if(st.equalsIgnoreCase("Gold")){
//                 int pp2 = (int)((n/10)*goldra);
//                 System.out.println(pp2);
//             }
//         }
//         else
//             System.out.println("Invalid Input");
//         s.close();
//     }
// }