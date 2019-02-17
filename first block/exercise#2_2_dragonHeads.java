import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите возраст дракона: ");
        int age = Integer.parseInt(in.readLine());
        int headQuantity = 3;

        if (age < 200){
            headQuantity = headQuantity + age * 3;
        } else if (age > 199 && age < 300){
            headQuantity = headQuantity + 199 * 3 + (age - 199) * 2;
        } else {
            headQuantity = headQuantity + 199 * 3 + (299 - 199) * 2 + (age - 299);
        }

        int eyeQuantity = headQuantity * 2;
        System.out.println("Количество голов: " + headQuantity + ", количество глаз: " + eyeQuantity);
    }
}

