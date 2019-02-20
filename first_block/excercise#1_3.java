import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        boolean isInputEnable = true;

        while (isInputEnable) {
            System.out.print("Введите радиусы: R1 = ");
            float r1 = Float.parseFloat(in.readLine());
            System.out.print("R2 = ");
            float r2 = Float.parseFloat(in.readLine());

            if (r1 > r2) {
                double result = PI * pow(r1, 2) - PI * pow(r2, 2);
                System.out.println("Площадь кольца составляет: " + result);
                isInputEnable = false;
            } else {
                System.out.println("Неправильный ввод! R1 должен быть больше R2!");
            }
        }
    }
}
