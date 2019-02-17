import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое семизначное число: ");
        int num = Integer.parseInt(in.readLine());
        if (num > 999999 && num < 10000000) {
            int result = 0;

            while (num > 0) {
                result = result * 10 + num % 10;
                num = num / 10;
            }

            System.out.println("Число наоборот: " + result);
        } else System.out.println("Неверный ввод!");
    }
}
