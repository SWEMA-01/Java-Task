
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }

        //2
        System.out.print("Input a string: ");
        String str = input.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reverse string: " + reverse);

        //3
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);

        //4
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result = " + result);

        //5
        int evenSum = 0;
        int oddSum = 0;
        System.out.print("How many numbers? ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number: ");
            int number = input.nextInt();
            if (number % 2 == 0)
                evenSum += number;
            else
                oddSum += number;
        }

        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);

        //6
        System.out.print("Enter a positive integer: ");
        int primeNum = input.nextInt();
        boolean isPrime = primeNum > 1;
        for (int i = 2; isPrime && i <= primeNum / i; i++) {
            if (primeNum % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");

        //7
        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week);

            for (int day = 1; day <= 7; day++) {
                System.out.println("Day" + day);
            }
        }

        //8
        input.nextLine();
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
