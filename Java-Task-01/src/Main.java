import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Weight:");
        double weight = input.nextDouble();
        System.out.println("Enter Your Height:");
        double height = input.nextDouble();
        double result = weight / (height * height);
        System.out.println("Your BMI is:" + result);

        //2
        System.out.println("Enter Your Earned Points:");
        double earnedPoints = input.nextDouble();
        System.out.println("Enter Total Points:");
        double totalPoints = input.nextDouble();
        double percentage = earnedPoints / totalPoints * 100;
        System.out.println("Your percentage is:" + percentage + "%");

        //3
        System.out.println("Enter amount in USD:");
        double usd = input.nextDouble();
        System.out.println("Enter exchange rate:");
        double exchangeRate = input.nextDouble();
        double eur = usd * exchangeRate;
        System.out.println("Amount in EUR:" + eur);

        //4
        input.nextLine();
        System.out.println("Enter a string:");
        String text = input.nextLine();
        StringBuilder sb = new StringBuilder(text);
        System.out.println("Length of the string: " + text.length());
        System.out.println("And Reversed string: \"" + sb.reverse() + "\"");

        //5
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        System.out.println("Enter start index:");
        int start = input.nextInt();
        System.out.println("Enter end index:");
        int end = input.nextInt();
        System.out.println(sentence.substring(start, end));
        input.nextLine();

        //6
        System.out.println("Enter a sentence:");
        sentence = input.nextLine();
        System.out.println("Enter a keyword:");
        String keyword = input.nextLine();
        System.out.println("Keyword \"" + keyword + "\" is present in the sentence.");

        //7
        System.out.println("Enter a sentence:");
        sentence = input.nextLine();
        System.out.println("Enter word to replace:");
        String oldWord = input.nextLine();
        System.out.println("Enter replacement word:");
        String newWord = input.nextLine();
        System.out.println(sentence.replace(oldWord, newWord));

        //8
        System.out.println("Enter first string:");
        String str1 = input.nextLine();
        System.out.println("Enter second string:");
        String str2 = input.nextLine();
        System.out.println("Strings are equal (ignoring case)");

    }}
