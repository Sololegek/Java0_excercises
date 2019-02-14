import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое шестизначное число: ");
        int num = Integer.parseInt(in.readLine());
        int digit;
        float ar_aver = 0;
        double g_aver = 1;
        int count = 0;

        do {
            digit = num % 10;
            num = num / 10;
            ar_aver = ar_aver + digit;
            g_aver = g_aver * digit;
            count++;
        } while (num > 0);

        ar_aver = ar_aver / count;
        g_aver = Math.pow(g_aver, 1.0/count);

        System.out.println("Среднее арифметическое: " + String.format("%.3f", ar_aver));
        System.out.println("Среднее геометрическое: " + String.format("%.3f", g_aver));
    }
}
