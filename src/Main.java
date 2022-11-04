import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(calc(userInput()));
    }

    public static String calc(String userInput) {
        if (arabicValidator(userInput)) {
            return arabicCalc(userInput);
        } else if (romainValidator(userInput)) {
            return romainCalc(userInput);
        } else {
            throw new InputFormatException();
        }
    }

    public static String arabicCalc(String userInput) {
        String operator = userInput.replaceAll("\\w", "");
        String[] subStr = userInput.split("\\W");
        int x = Integer.parseInt(subStr[0]);
        int y = Integer.parseInt(subStr[1]);
        switch (operator) {
            case "+":
                return String.valueOf(x + y);
            case "-":
                return String.valueOf(x - y);
            case "*":
                return String.valueOf(x * y);
            case "/":
                return String.valueOf(x / y);
        }
        return null;
    }

    public static String romainCalc(String userInput) {
        HashMap<String, Integer> romainNum = new HashMap<>();
        String[] r_nums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",};
        for (int i = 0; i < r_nums.length; i++) {
            romainNum.put(r_nums[i], i + 1);
        }
        String operator = userInput.replaceAll("\\w", "");
        String[] subStr = userInput.split("\\W");
        int x = romainNum.get(subStr[0]);
        int y = romainNum.get(subStr[1]);
        switch (operator) {
            case "+":
                return arabicToRomain(x + y);
            case "-":
                if (x - y < 1) {
                    throw new NegativeRomanNumberException();
                } else {
                    return r_nums[x - y - 1];
                }
            case "*":
                return arabicToRomain(x * y);
            case "/":
                if (x / y < 1) {
                    throw new NegativeRomanNumberException();
                } else {
                    return r_nums[x / y - 1];
                }

        }
        return null;
    }

    public static String userInput() {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        return line.replaceAll(" ", "");
    }

    public static boolean arabicValidator(String userInput) {
        return Pattern.matches("([1-9]|(10))[+-/*//]([1-9]|(10))", userInput);
    }

    public static boolean romainValidator(String userInput) {
        return Pattern.matches("(I|II|III|IV|V|VI|VII|VIII|IX|X)([+-/*//])(I|II|III|IV|V|VI|VII|VIII|IX|X)", userInput);
    }


    public static String arabicToRomain(int arabicNum) {
        StringBuilder romainNum = new StringBuilder();
        String[] r_nums = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] a_nums = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < r_nums.length; i++) {
            while (arabicNum >= a_nums[i]) {
                romainNum.append(r_nums[i]);
                arabicNum -= a_nums[i];
            }
        }
        return romainNum.toString();
    }

}