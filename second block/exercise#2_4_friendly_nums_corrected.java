import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int num = Math.abs(r.nextInt(10000));
        int num2 = Math.abs(r.nextInt(100000));
        int count = 0;
        int tempNum = num;

        num = num == 0 ? num + 1 : num;
        num2 = num2 == 0 ? num2 + 1 : num2;

        if (num > num2){
            tempNum = num2;
            num2 = num;
            num = tempNum;
        }
        System.out.println("Нижний предел: " + num);
        System.out.println("Верхний предел: " + num2);

        while (tempNum < num2){
            int result = findSum(tempNum);
            if (result < num2 && result > num) {
                int result2 = findSum(result);
                if (result2 == tempNum && tempNum != result) {
                    System.out.println("Числа " + tempNum + " и " + result + " являются дружественными.");
                    count++;
                }
            }
            tempNum++;
        }

        if (count == 0){
            System.out.println("В диапазоне от " + num + " до " + num2 + " дружественных чисел не найдено.");
        } else {
            System.out.println("В диапазоне от " + num + " до " + num2 + " найдено " + count + " дружественных чисел.");
        }

    }

    private static int findSum(int num){
        int result = 0;
        for (int divider = 1; divider <= num / 2; divider++){
            if (num % divider == 0){
                result += divider;
            }
        }
        return result;
    }
}
