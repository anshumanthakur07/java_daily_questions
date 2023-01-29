// // Ashish and Ajay are two good friends, they got mathematic assignment to find number whether the number is prime or not. Write a java program to help them.

// // Input Format

// // Number(N)

// // Constraints

// // N cannot be greater then 50. If user enter more than 50 then print "Number out of limit"
// // number cannot be negative number if user enter then print "Number should be Positive"

// // Output Format

// // 11 Prime Number 15 Non Prime Numberimport java.io.*;






// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class day2{

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         if(n > 50){
//             System.out.println("Number out of limit");
//             return;
//         }
//         if(n < 0){
//             System.out.println("Number should be Positive");
//             return;
//         }
        
//         if(isPrime(n)){
//             System.out.println("Prime Number");
//         }
//         else{
//             System.out.println("Non Prime Number");
//         }
        
        
//     }
    
//     public static boolean isPrime(int num){
//         //using primality test method (Number theory)
//         if(num == 1){
//             return false;
//         }
        
//         for(int i = 2; i * i <= num; i++){
//             if(num % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }
// // ---------------------------------------------------------------------------------------------------------------------------

// John has got a Mathematical assignment where he has to find mean of a given set of 3 integers. Write a Java program solution to help John .

// Input Format

// First line will accept 3 positive intergers

// Constraints

// All positive integers must be > 1 And < 1000

// Output Format

// mean of 3 integer values

// import java.util.Scanner;

// public class day2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         double mean = (double)(a+b+c)/3;
//         System.out.println(String.format("%.1f", mean));
//     }
// }