// Метод для проверки делимости на 4 и неделимости на 6

import java.util.Scanner;

public class Main {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static String getMiddleChars(String s) {
        int length = s.length();
        if (length % 2 != 0) {
            throw new RuntimeException("Strings ne chetnie :( ");
        }
        int middleIndex = length / 2;
        return s.substring(middleIndex - 1, middleIndex + 1);
    }

    public static void zad_c() {
        String text = "ffdcrzv aa2aa f 1234 jkjk"; // строку непосредственно в код
        String[] words = text.split("\\s+");
        String shortestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (countUniqueChars(words[i]) < countUniqueChars(shortestWord)) {
                shortestWord = words[i];
            }
        }

        System.out.println("\nWord with minimal unique characters: " + shortestWord);
    }

    private static int countUniqueChars(String word) {
        boolean[] charSeen = new boolean[256];
        int uniqueCount = 0;

        for (char c : word.toCharArray()) {
            if (!charSeen[c]) {
                charSeen[c] = true;
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
    public static void zad_d() {
        String text = "One two three ale раз два восемь one1 two2 123";
        String[] words = text.split(" ");
        int count = words.length;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char currentChar = words[i].charAt(j);
                // Проверка на латинские буквы :
                if (!Character.isLetter(currentChar) ||
                        (currentChar >= 'а' && currentChar <= 'я') || // Русские буквы
                        (currentChar >= 'А' && currentChar <= 'Я') || // Русские буквы
                        (currentChar >= 'ё' && currentChar <= 'Ё')  // Русские буквы
                ) {
                    count--;
                    break;
                }
            }
        }
        System.out.println("kol-vo slow " + count);
    }

    public static void main(String[] args) {
        // a) Print numbers from 0 to 300 that are divisible by 4, not divisible by 6, and the sum of their digits is less than 10
        System.out.println("Numbers from 0 to 300 that meet the condition:");
        for (int i = 0; i <= 300; i++) {
            if (i % 4 == 0 && i % 6 != 0) {
                int digitSum = sumOfDigits(i);
                if (digitSum < 10) {
                    System.out.println(i);
                }
            }
        }

        // b) Return the two middle characters of a string
        System.out.println("\nMiddle characters of strings:");
        System.out.println(getMiddleChars("notebook"));
        System.out.println(getMiddleChars("code"));
        System.out.println(getMiddleChars("Practice"));

        // c) Найти слово, в котором число различных символов минимально
        zad_c();
        zad_d();
    }
}

