package by.incubator.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {
        String str = "Hello, user! How are you?";
        addingToTheEnd(str);
        insertAtSpecificPosition(str);
        removeFromText(str);
        replacingSubstring(str);

        Scanner scannerForReverse = new Scanner(System.in);
        String strForReverse = scannerForReverse.nextLine();
        reverse(strForReverse);

        Scanner scannerForRemoveSpaces = new Scanner(System.in);
        String strForRemoveSpaces = scannerForRemoveSpaces.nextLine();
        removeSpaces(strForRemoveSpaces);

        String scannerForOutputUpperCaseLetters = new Scanner(System.in).nextLine();
        StringBuilder strForOutputUpperCase = new StringBuilder();
        upperCaseLetters(strForOutputUpperCase.append(scannerForOutputUpperCaseLetters));

        String scannerForOutputEvenLetters = new Scanner(System.in).nextLine();
        StringBuilder strForOutputEvenLetters = new StringBuilder();
        upperCaseEvenLetters(strForOutputEvenLetters.append(scannerForOutputEvenLetters));

        BufferedReader scannerForReplaceEmptyString = new BufferedReader(new InputStreamReader(System.in));
        Scanner strForReplaceEmptyString = new Scanner(System.in);
        int size = strForReplaceEmptyString.nextInt();
        String[] arrayString = new String[size];
        replaceEmptyString(arrayString, size, scannerForReplaceEmptyString);

        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "C#";
        String str4 = "Java";
        compareTheResults(str1, str2, str3, str4);
    }

    private static void addingToTheEnd(String str) {
        String strNewEndWord = "Fine!";
        String newWord = str + strNewEndWord;
        System.out.println(newWord);
    }

    private static void insertAtSpecificPosition(String str) {
        String NewInWord = "dear";
        String strInWord = (new StringBuffer(str)).insert(6, NewInWord).toString();
        System.out.println(strInWord);
    }

    private static void removeFromText(String str) {
        String delete = "!";
        String strDel = str.replace(delete, "");
        System.out.println(strDel);
    }

    private static void replacingSubstring(String str) {
        String newStr = str.replace("user", "programmer");
        System.out.println(newStr);
    }

    private static void reverse(String str) {
        char[] arrayChar = str.toCharArray();
        String result = "";
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            result = result + arrayChar[i];
        }
        System.out.println(result);
    }

    private static void removeSpaces(String str) {
        int kol = 0;
        for (char i : str.toCharArray()) {
            if (i == ' ') {
                kol++;
            }
        }
        System.out.println(kol);

        String newStr = str.replace(" ", "");
        System.out.println(newStr);
    }

    private static void upperCaseLetters(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                System.out.print(str.charAt(i));
            }
        }
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
    }

    private static void replaceEmptyString(String[] arr, int size, BufferedReader scanner) throws IOException {
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.readLine();
            arr[i] = arr[i].isEmpty() ? arr[i] = "String is empty" : arr[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.println(" " + arr[i]);
        }
    }

    private static void compareTheResults(String str1, String str2, String str3, String str4) {
        boolean res;
        res = str1.equals(str2);
        System.out.println(res);

        res = str1.equalsIgnoreCase(str2);
        System.out.println(res);

        System.out.println(str1 == str4);

        str1 = " JavaJava";
        System.out.println(str1.substring(4) == str4);

        System.out.println(str1 == null);

        str1 = null;
        System.out.println(str1 == null);
    }
}