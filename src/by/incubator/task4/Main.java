package by.incubator.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        dayOfWeek();
    }

    public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        int numberOfDay = scanner.nextInt();
        System.out.println(numberOfDay);
        Weekday[] weekday = Weekday.values();

        if (numberOfDay >= 1 && numberOfDay <= 7) {
            System.out.println(weekday[numberOfDay - 1] + " (" + weekday[numberOfDay - 1].getShortName() + ") " +
                    (weekday[numberOfDay - 1].isWeekend() ? "is a weekend" : "is not a weekend"));
        } else {
            int notDay = numberOfDay;
            System.out.print("Entered the wrong day of the week number: ");
            System.out.println(notDay);
        }
    }
}