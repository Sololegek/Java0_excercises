import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите массу динозавра в килограммах: ");
        double kg = Double.parseDouble(in.readLine());

        double g = kg * 1000;
        double mg = g * 1000;
        double t = kg / 1000;

        System.out.println("Масса динозавра:");
        System.out.println(String.format("%.0f", g) + " грамм");
        System.out.println(String.format("%.0f", mg) + " миллиграмм");
        System.out.println(String.format("%.4f", t) + " тонн");

    }
}
