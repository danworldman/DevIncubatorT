package by.incubator.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {
        String str = "Hello, user! How are you?";
        String resultAddingToTheEnd = addingToTheEnd(str);
        printAddingToTheEnd(resultAddingToTheEnd);

        String resultInsertAtSpecificPosition = insertAtSpecificPosition(str);
        printInsertAtSpecificPosition(resultInsertAtSpecificPosition);


        String resultRemoveFromText = removeFromText(str);
        printRemoveFromText(resultRemoveFromText);

        String resultReplacingSubstring = replacingSubstring(str);
        printReplacingSubstring(resultReplacingSubstring);

        String strScanner = scanner();
        String resultReverse = reverse(strScanner);
        printReverse(resultReverse);

        String resultRemoveSpaces = removeSpaces(strScanner);
        printRemoveSpaces(resultRemoveSpaces);
        int resultKolRemoveSpaces = kolRemoveSpaces(strScanner);
        printKolRemoveSpaces(resultKolRemoveSpaces);

        String scannerForOutputUpperCaseLetters = new Scanner(System.in).nextLine();
        StringBuilder strForOutputUpperCase = new StringBuilder();
        upperCaseLetters(strForOutputUpperCase.append(scannerForOutputUpperCaseLetters));

        String scannerForOutputEvenLetters = new Scanner(System.in).nextLine();
        StringBuilder strForOutputEvenLetters = new StringBuilder();
        upperCaseEvenLetters(strForOutputEvenLetters.append(scannerForOutputEvenLetters));

        BufferedReader scannerForReplaceEmptyString = new BufferedReader(new InputStreamReader(System.in));
        Scanner strForReplaceEmptyString = new Scanner(System.in);
        int size = strForReplaceEmptyString.nextInt();
        String arrayString[] = replaceEmptyString(size, scannerForReplaceEmptyString);
        printReplaceEmptyString(arrayString);
        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "C#";
        String str4 = "Java";
        boolean result12 = compareInParisStr1AndStr2(str1, str2);
        printCompareInParis(result12);
        boolean result13 = compareInParisStr1AndStr3(str1, str3);
        printCompareInParis(result13);
        boolean result14 = compareInParisStr1AndStr4(str1, str4);
        printCompareInParis(result14);
        boolean result23 = compareInParisStr2AndStr3(str2, str3);
        printCompareInParis(result23);
        boolean result24 = compareInParisStr2AndStr4(str2, str4);
        printCompareInParis(result24);
        boolean result34 = compareInParisStr3AndStr4(str3, str4);
        printCompareInParis(result34);

        boolean resultEqualsMethod = equalsMethod(str1, str2);
        printEqualsMethod(resultEqualsMethod);

        boolean resultOperationMethod = operationMethod(str1, str4);
        printOperationMethod(resultOperationMethod);

        boolean resultSubStringMethod = subStringMethod(str1, str4);
        printSubStringMethod(resultSubStringMethod);
        boolean resultOperatorNull = operatorNull(str1);
        printOperatorNull(resultOperatorNull);

        boolean resultCompareOperationNull = compareOperationNull(str1);
        printCompareOperationNull(resultCompareOperationNull);
    }

    private static String addingToTheEnd(String str) {
        String strNewEndWord = "Fine!";
        return str + strNewEndWord;
    }

    public static void printAddingToTheEnd(String result) {
        System.out.println(result);
    }

    private static String insertAtSpecificPosition(String str) {
        String NewInWord = "dear";
        return (new StringBuffer(str)).insert(6, NewInWord).toString();
    }

    public static void printInsertAtSpecificPosition(String result) {
        System.out.println(result);
    }

    private static String removeFromText(String str) {
        String delete = "!";
        return str.replace(delete, "");
    }

    public static void printRemoveFromText(String result) {
        System.out.println(result);
    }

    private static String replacingSubstring(String str) {
        return str.replace("user", "programmer");
    }

    public static void printReplacingSubstring(String result) {
        System.out.println(result);
    }

    private static String scanner() throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String strScanner = scanner.readLine();
        return strScanner;
    }

    private static String reverse(String str) {
        char[] arrayChar = str.toCharArray();
        String result = "";
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            result = result + arrayChar[i];
        }
        return result;
    }

    public static void printReverse(String result) {
        System.out.println(result);
    }

    private static String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    public static void printRemoveSpaces(String result) {
        System.out.println(result);
    }

    public static int kolRemoveSpaces(String str) {
        int kol = 0;
        for (char i : str.toCharArray()) {
            if (i == ' ') {
                kol++;
            }
        }
        return kol;
    }

    public static void printKolRemoveSpaces(int result) {
        System.out.println(result);
    }

    private static void upperCaseLetters(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }

    private static void upperCaseEvenLetters(StringBuilder str) {
        for (int i = 1; i < str.length(); i += 2) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
                    str = str.replace(i, i + 1, str.substring(i, i + 1).toUpperCase());
                }
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    private static String[] replaceEmptyString(int size, BufferedReader scanner) throws IOException {
        String[] arrayString = new String[size];
        for (int i = 0; i < size; i++) {
            arrayString[i] = scanner.readLine();
            arrayString[i] = arrayString[i].isEmpty() ? arrayString[i] = "String is empty" : arrayString[i];
        }
        return arrayString;
    }

    public static void printReplaceEmptyString(String[] arrayString) {
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(" " + arrayString[i]);
        }
    }

    public static boolean compareInParisStr1AndStr2(String strFirst, String strSecond) {
        return strFirst.equals(strSecond);
    }

    public static boolean compareInParisStr1AndStr3(String strFirst, String strSecond) {
        return strFirst.equals(strSecond);
    }

    public static boolean compareInParisStr1AndStr4(String strFirst, String strSecond) {
        return strFirst.equals(strSecond);
    }

    public static boolean compareInParisStr2AndStr3(String strFirst, String strSecond) {
        return strFirst.equals(strSecond);
    }

    public static boolean compareInParisStr2AndStr4(String strFirst, String strSecond) {
        return strFirst.equals(strSecond);
    }

    public static boolean compareInParisStr3AndStr4(String strFirst, String strSecond) {
        return strFirst.equals(strSecond);
    }

    public static void printCompareInParis(boolean result) {
        System.out.println(result);
    }

    public static boolean equalsMethod(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public static void printEqualsMethod(boolean result) {
        System.out.println(result);
    }

    public static boolean operationMethod(String str1, String str4) {
        if (str1 == str4) {
            return true;
        }
        return false;
    }

    public static void printOperationMethod(boolean result) {
        System.out.println(result);
    }

    public static boolean subStringMethod(String str1, String str4) {
        str1 = " JavaJava";
        if (str1.substring(4) == str4) {
            return true;
        }
        return false;
    }

    public static void printSubStringMethod(boolean result) {
        System.out.println(result);
    }

    public static boolean operatorNull(String str1) {
        if (str1 == null) {
            return true;
        }
        return false;
    }

    public static void printOperatorNull(boolean result) {
        System.out.println(result);
    }

    public static boolean compareOperationNull(String str1) {
        str1 = null;
        if (str1 == null) {
            return true;
        }
        return false;
    }

    public static void printCompareOperationNull(boolean result) {
        System.out.println(result);
    }
}