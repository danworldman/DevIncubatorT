package by.incubator.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfDay = scannerNumber();
        printScannerNumber(numberOfDay);
        boolean result = dayOfWeek(numberOfDay);
        printInfoOfDay(result, numberOfDay);
    }

    public static boolean dayOfWeek(int numberOfDay) {
        if (numberOfDay >= 1 && numberOfDay <= 7) {
            return true;
        } else {
            return false;
        }
    }

    public static int scannerNumber() {
        Scanner scanner = new Scanner(System.in);
        int numberDay = scanner.nextInt();
        return numberDay;
    }

    public static void printScannerNumber(int numberDay) {
        System.out.println("The number of day: " + numberDay);
    }

    public static void printInfoOfDay(boolean res, int numberOfDay) {
        Weekday[] weekday = Weekday.values();
        if (res == true) {
            System.out.println(weekday[numberOfDay - 1] + " (" + weekday[numberOfDay - 1].getShortName() + ") " +
                    (weekday[numberOfDay - 1].isWeekend() ? "is a weekend" : "is not a weekend"));
        } else {
            System.out.print("Entered the wrong day of the week number: ");
            System.out.println(numberOfDay);
        }
    }
}