package pattern1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Scanner;

public class pattern1 

{
    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    
   

    private static String convertNumberToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            return "minus " + convertNumberToWords(Math.abs(number));
            
        }
        

        StringBuilder words = new StringBuilder();

        if (number / 1000000 > 0) {
            words.append(convertNumberToWords(number / 1000000)).append(" million ");
            number %= 1000000;
        }

        if (number / 1000 > 0) {
            words.append(convertNumberToWords(number / 1000)).append(" thousand ");
            number %= 1000;
        }

        if (number / 100 > 0) {
            words.append(convertNumberToWords(number / 100)).append(" hundred ");
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                words.append(units[number]);
            } else {
                words.append(tens[number / 10]);
                if (number % 10 > 0) {
                    words.append("-").append(units[number % 10]);
                }
            }
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String words = convertNumberToWords(number);
        System.out.println("Textual representation: " + words);
    }
}

