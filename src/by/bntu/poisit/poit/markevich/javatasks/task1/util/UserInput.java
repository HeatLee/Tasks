package by.bntu.poisit.poit.markevich.javatasks.task1.util;

import java.util.Scanner;

public class UserInput {

    public String inputString(String msg) {

        System.out.print(msg);
        return new Scanner(System.in).nextLine();
    }

    public static int inputInt(String msg) {

        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("That not a number!");
            System.out.print(msg);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double inputDouble(String msg) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);

        while (!scanner.hasNextDouble()) {
            System.out.println("That not a number!");
            System.out.print(msg);
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public char inputChar(String msg) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);

        return scanner.next().charAt(0);
    }


    public long inputLong(String msg) {

        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextLong()) {
            System.out.println("That not a number!");
            System.out.print(msg);
            scanner.next();
        }
        return scanner.nextLong();
    }


}
