import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое четырёхзначное число: ");
        int num = Integer.parseInt(in.readLine());
        int[] digits = new int[4];
        int i = 0;
        boolean upper = true;

        do {
            digits[i] = num % 10;
            num = num / 10;
            if (i > 0 && (digits[i] > digits[i-1] || i == 3)){
                upper = false;
            } else {
                i++;
                }
        } while (upper);

        if (i == 3){
            System.out.println("Возрастающая последовательность");
        } else {
            System.out.println("Последовательность невозрастающая");
            }
    }
}

