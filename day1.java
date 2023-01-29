// Write a program to take the 3 inputs of integer type from the user. Display the values separated by symbol ‘*’ if the values are positive otherwise display the message “Invalid Input”.

// Output should be the input values separated by ‘*‘ or “Invalid Input” message if any input is negative.

// Sample Input 0


// import java.util.Scanner;
// public class day1 {

//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         int x=s.nextInt();
//         int y=s.nextInt();
//         int z=s.nextInt();
//         if(x<0 ||y<0||z<0)
//         {
//             System.out.println("Invalid Input");
//         }
//         else
//             System.out.println(x+"*"+y+"*"+z);
//             s.close();

//     }
// }


// Shyam asked him frieds Venu to devlop a program which is use to perfome arithmetic operation. He told that When I will enter two number and operator. It will perform operation based on given operator and result will display.

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        String operator;
        num1 = input.nextInt();
        num2 = input.nextInt();
        operator = input.next();
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid arithmetic operators");
                return;
        }
        System.out.println( + result);
    }
}