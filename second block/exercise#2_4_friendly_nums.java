import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите нижний предел: ");
        int num = Integer.parseInt(br.readLine());
        System.out.print("Введите верхний предел: ");
        int num2 = Integer.parseInt(br.readLine());
        int count = 0;
        int tempNum = num;

        if (num > num2){
            tempNum = num2;
            num2 = num;
            num = tempNum;
        }

        while (tempNum < num2){
            int result = findSum(tempNum);
            if (result < num2 & result > num) {
                int result2 = findSum(result);
                if (result2 == tempNum & tempNum != result) {
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