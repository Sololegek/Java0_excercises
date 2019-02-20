import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое четырёхзначное число: ");
        int num = Integer.parseInt(in.readLine());
        int[] digits = new int[4];
        int result = 0;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = num % 10;
            num = num / 10;
        }

        for (int i = 0; i < digits.length-1; i++) {
            if (digits[i] > digits[i+1]){
                result++;
            } else if (digits[i] < digits[i+1]){
                result--;
            } else if (digits[i] == digits[i+1]){
                result = 0;
            }
        }

        if (result == 3){
            System.out.println("Последовательность возрастающая.");
        } else if (result == -3){
            System.out.println("Последовательность убывающая.");
        } else{
            System.out.println("Последовательность неравномерная.");
        }
    }
}
