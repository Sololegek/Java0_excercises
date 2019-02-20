import java.util.Random;

public class Main {

    public static void main(String[] args)  {
        Random r = new Random();
        int num = Math.abs(r.nextInt());
        int num2 = Math.abs(r.nextInt());
        System.out.println("Первое число: " + num + ", второе число: " + num2);

        System.out.println("Наибольшая цифра в числе " + num + " - это: " + findMax(num));

        if (isPalindrome(num)) {
            System.out.println("Число " + num + " является палиндромом.");
        } else {
            System.out.println("Число " + num + " не палиндром.");
        }

        if (isSimple(num)) {
            System.out.println("Число " + num + " простое.");
        } else {
            System.out.println("Число " + num + " не простое.");
        }

        System.out.println("Простые делители числа " + num + ": " + findSimpleDividers(num));

        System.out.println("Наибольший общий делитель чисел " + num + " и " + num2 + ": " + findNod(num, num2));

        System.out.println("Наименьшее общее кратное чисел " + num + " и " + num2 + ": " + findNok(num, num2));

        System.out.println("В числе " + num + " " + findDifferentDigits(num) + " различных цифр.");
    }

    private static int findMax(int num){
        int result = num % 10;
        do {
            num = num /10;
            if (result < num % 10){
                result = num % 10;
            }
        } while (num > 0 & result < 9);
        return result;
    }

    private static boolean isPalindrome(int num){
        int reverseNum = 0;
        int tempNum = num;
        while (tempNum > 0){
            reverseNum = reverseNum * 10 + tempNum % 10;
            tempNum = tempNum / 10;
        }
        if (reverseNum == num){
                return true;
            }
        return false;
    }

    private  static boolean isSimple(int num){
        int dividers = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    dividers++;
                }
                if (dividers > 2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static String findSimpleDividers(int num){
        String result = "";
        for (int divider = 2; divider <= num / 2; divider++){
            if (num % divider == 0){
                if (isSimple(divider)){
                    result += divider + " ";
                }
            }
        }
        return result;
    }

    private static int findNod(int a, int b){
        int result;
        int min;
        if (a > b){
            min =  b;
        } else {
            min = a;
        }
        for (int i = 1; i <= min; i++) {
            result = min/i;
            if (a % result == 0 & b % result == 0) {
                return result;
            }
        }
        return 1;
    }

    private static long findNok(int a, int b){
        long result;
        int max;
        int min;
        if (a > b){
            max =  a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        for (int i = 1; i <= min; i++) {
            result = (long) max*i;
            if (result % min == 0) {
                return result;
            }
        }
        return 0;
    }

    private static int findDifferentDigits(int num){
        int count = 0;
        final int ORIGINAL = num;
        while (num > 0) {
            int tempNum = ORIGINAL;
            int digit = num % 10;
            count++;
            while (tempNum > 0) {
                if (digit == tempNum % 10) {
                    if(tempNum > num){
                        tempNum = 0;
                        count--;
                    }
                }
                tempNum = tempNum / 10;
            }
            num = num / 10;
        }
        return count;
    }
}