
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter your username:");
        String name = inpt.nextLine();

        if (name.equalsIgnoreCase("admin")) {
            System.out.println("welcome admin");
        }
        else if (name.equalsIgnoreCase("superuser")) {
            System.out.println("welcome superuser");
        }
        else if (name.equalsIgnoreCase("user")) {
            System.out.println("welcome user");
        }
        else {
            System.out.println("Invalid role");
        }

        //2
        System.out.println("Enter numberOne:");
        int numOne = inpt.nextInt();
        System.out.println("Enter numberTwo:");
        int numTwo = inpt.nextInt();
        System.out.println("Enter numberThree:");
        int numThree = inpt.nextInt();

        int max = numOne;

        if (numTwo > max) {
            max = numTwo;
        }

        if (numThree > max) {
            max = numThree;
        }

        System.out.println("The number is big:" + max);

        //3
        int day = (int)(Math.random() * 7) + 1;

        System.out.println("Random day number: " + day);

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

        //4
        System.out.println("Enter the numeric grade:");
        int grade = inpt.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade");
        }
        else if (grade >= 90) {
            System.out.println("A");
        }
        else if (grade >= 80) {
            System.out.println("B");
        }
        else if (grade >= 70) {
            System.out.println("C");
        }
        else if (grade >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

        //5
        System.out.println("Enter your Age:");
        int age = inpt.nextInt();

        if (age < 13) {
            System.out.println("Child");
        }
        else if (age <= 19) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Adult");
        }

        inpt.close();
    }
}
