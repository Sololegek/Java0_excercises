import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int digit;
        float ar_aver = 0;
        double g_aver = 1;

        do {
            System.out.println("Введите целое шестизначное число: ");
            num = Integer.parseInt(in.readLine());
        } while (num < 99999 || num > 1000000);

        do {
            digit = num % 10;
            num = num / 10;
            ar_aver = ar_aver + digit;
            g_aver = g_aver * digit;
        } while (num > 0);

        ar_aver = ar_aver / 6.0f;
        g_aver = Math.pow(g_aver, 1.0/6.0);

        System.out.println("Среднее арифметическое: " + String.format("%.3f", ar_aver));
        System.out.println("Среднее геометрическое: " + String.format("%.3f", g_aver));
    }
}
